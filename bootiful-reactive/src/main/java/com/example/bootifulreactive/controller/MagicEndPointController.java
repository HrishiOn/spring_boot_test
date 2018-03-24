package com.example.bootifulreactive.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("https://tw-http-hunt-api-1062625224.us-east-2.elb.amazonaws.com") 
public class MagicEndPointController {

	@GetMapping("/challengeX")
	public ResponseEntity<String> letsDoThis() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<>("{\"userId\": \"SJ88VOzFf\"}",headers, HttpStatus.OK);
	}
	
	@GetMapping("/challenge")
	public String successHit() {
		return "Mayday Mayday... I've been hit...";
	}
}
