package com.example.kafka.demo.kafkaUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleStringProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void produceStringMessage(String message) {
		kafkaTemplate.send("NAME", message);
		System.out.println("produce:" + message);
	}
}
