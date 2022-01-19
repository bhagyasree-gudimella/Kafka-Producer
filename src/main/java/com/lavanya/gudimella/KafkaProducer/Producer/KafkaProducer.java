package com.lavanya.gudimella.KafkaProducer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lavanya.gudimella.KafkaProducer.Model.Employee;

@RestController
@RequestMapping("kafka")
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate; // without model

//	@Autowired
//	private KafkaTemplate<String, Employee> modelkafkaTemplate; // with model

	private static final String Topic = "Kafka_Example";

	@RequestMapping(value = "/producer/{message}", method = RequestMethod.GET)
	public String kafkaProducerImpl(@PathVariable String message) {
		kafkaTemplate.send(Topic, message);
		return "Message published successfully";
	}

//	@RequestMapping(value = "/producer/model/{name}/{address}", method = RequestMethod.GET)
//	public String KafkaProducerModelImpl(@PathVariable String name, @PathVariable String address) {
//		modelkafkaTemplate.send(Topic, new Employee(name, 10000, address));
//		return "Model published successfully";
//	}
}
