package org.example.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.example.dto.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaAvroConsumer {

    @KafkaListener(topics = "${topic.name}")
    public void read(ConsumerRecord<String, Employee> consumerRecord){
        String key=consumerRecord.key();
        Employee employee = consumerRecord.value();

    }

}
