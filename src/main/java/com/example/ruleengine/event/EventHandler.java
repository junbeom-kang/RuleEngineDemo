package com.example.ruleengine.event;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventHandler {

  @KafkaListener(topics = "event_log", groupId = "default")
  public void consume(String message) {
    System.out.println("receive message : " + message);
  }



}
