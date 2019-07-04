package com.docker.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.demoapp.repository.Status;
import com.docker.demoapp.repository.StatusRepository;

@RestController
public class StatusController {
	
	@Autowired
	private StatusRepository repository;
	
	@GetMapping("/status")
	public String getStatus() {
		return "status";
	}
	
	@GetMapping("/dbstatus")
	public List<Status> getDbStatus() {
		return repository.findAll();
	}
}
