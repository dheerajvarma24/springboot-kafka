package com.example.kafka.demo.kafkaUtility;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleStringConsumer {
	
	@KafkaListener(topics = "NAME")
	public void subscribeNameConsumer(String message) {
		System.out.println("got the subscribed message:"+ message);
	}

}
