package com.nisum.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	
	public String showWelcomePage(Registration registration) {		
		 
		Registration obj= registrationRepository.findOne(registration.getUserName());
	     
		if(obj.getUserName()!=null && !"".equals(obj.getUserName())){
			 return "home";  
		}else
			return "fail"; 
		}

	public String saveRegistration(Registration registration) {	
		 registrationRepository.save(registration);	
		 return "home";  
		}
	}			
	
	
