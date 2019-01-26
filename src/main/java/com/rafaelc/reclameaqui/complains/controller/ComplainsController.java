package com.rafaelc.reclameaqui.complains.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelc.reclameaqui.complains.entity.Complain;
import com.rafaelc.reclameaqui.complains.repository.ComplainsRepository;

@RestController
@RequestMapping("/complains")
public class ComplainsController {
	final static Logger logger = LoggerFactory.getLogger(ComplainsController.class);

	
	@Autowired
	ComplainsRepository repository;
	
	@PostMapping
	public @ResponseBody Complain createComplain(@RequestBody Complain complain) {
		Complain complainResponse = repository.save(complain);
		logger.info("Complain created with sucess!\n ComplainID = " + complainResponse.getId() + "\n" + complainResponse.toString());
		return complainResponse;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Complain getComplain(@PathVariable("id") String id) {
		return repository.findById(id).orElse(new Complain());
	}
	
	@GetMapping
	public @ResponseBody List<Complain> getAllComplains(){
		return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
