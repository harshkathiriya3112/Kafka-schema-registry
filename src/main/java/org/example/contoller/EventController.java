package org.example.contoller;

import org.example.dto.Employee;
import org.example.producer.KafkaAvroProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avroApp/")
public class EventController {
    @Autowired
    KafkaAvroProducer producer;

    @PostMapping("/events")
    public String sendMessage(@RequestBody Employee employee){
        producer.send(employee);
        return "message published!";
    }
}
