package com.example.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.kafka.demo.kafkaUtility.SimpleStringProducer;

@RestController
@RequestMapping("/kafka")
public class SimpleController {
	
	@Autowired
	private SimpleStringProducer simpleStringProducer;
	
	@GetMapping("/publish/{message}")
	public String getMessage(@PathVariable String message) {
		System.out.println("In SimpleController -> getMessage");
		simpleStringProducer.produceStringMessage(message);
		return message;
	}

}
