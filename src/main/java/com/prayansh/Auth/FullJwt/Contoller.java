package com.prayansh.Auth.FullJwt;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prayansh.Auth.models.Dummy;
import com.prayansh.Auth.models.JwtResponse;

@RestController
@CrossOrigin
public class Contoller {

	 @GetMapping("/test")
	    public ResponseEntity<JwtResponse> test() {
//	        this.logger.warn("This is working message");
		 JwtResponse j=new JwtResponse("123123sdasdvhgd sa das");
		 j.setUsername("DURGESH");
		 System.out.println("hello tesst");
		
	        return ResponseEntity.ok(j);
	    }
	 
	 
	
}
