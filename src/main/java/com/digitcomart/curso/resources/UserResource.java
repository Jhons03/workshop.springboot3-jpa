package com.digitcomart.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitcomart.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Edson", "edin2008@yahoo.com.br", "99999-9999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
