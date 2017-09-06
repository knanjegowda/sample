package com.nisum.login;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.nisum.login.Registration;
import com.nisum.login.RegistrationRepository;

@Controller

public class LoginController {
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)	
	public String welcome() {
		return "welcome";
	}
	
	 @RequestMapping(value="/welcome", method = RequestMethod.POST)
	    public String showWelcomePage(ModelMap model, @RequestBody Registration registration){
		 
		Registration obj= registrationRepository.findOne(registration.getUserName());
         
		if(obj.getUserName()!=null && !"".equals(obj.getUserName())){
			 return "users";  
		}else
			return "fail"; 
		}
	 
	 
	 @RequestMapping("/users")
	 public String getUsers(Model model){
		 List<Registration> users=(List<Registration>) registrationRepository.findAll();
		 model.addAttribute("usersLst", users);
		 return "users";
	 }
	 
	 
	 @RequestMapping(value = "/registration", method = RequestMethod.GET)
	 public String registrationPage(){
		
		 return "registration";
	 }
	 
	 

	@RequestMapping(value="/registration", method = RequestMethod.POST)
	    public String regisrationLogin(ModelMap model,@RequestBody  Registration registration){
		 
		 if(registration.getPassword().equals(registration.getConfirmPassword())){
		
		 registrationRepository.save(registration);
		 return "users";
		 } else{
			 return "fail";
		 }
	       
	    }
}
