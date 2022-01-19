package com.lavanya.gudimella.KafkaProducer.Configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import org.springframework.kafka.support.serializer.JsonSerializer;
import com.lavanya.gudimella.KafkaProducer.Model.Employee;

@Configuration
public class KafkaConfiguration {
	
//	@Bean
//	public ProducerFactory<String, Employee> producerFactory() {
//		Map<String, Object> config = new HashMap<String, Object>();
//		
//		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//		
//		return new DefaultKafkaProducerFactory<String, Employee>(config);
//	}
	
//	@Bean 
//	public KafkaTemplate<String, Employee> modelkafkaTemplate() {
//		return new KafkaTemplate<String, Employee>(producerFactory());
//	}
}
