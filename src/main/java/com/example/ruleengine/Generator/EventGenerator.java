package com.example.ruleengine.Generator;

import com.example.ruleengine.event.EventRecord;
import com.example.ruleengine.event.TransferEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventGenerator {

  private static final String TOPIC = "event_log";

  private final KafkaTemplate<String, String> kafkaTemplate;


  public void sendMessage() {
    TransferEvent transferEvent = new TransferEvent();
    System.out.println(String.format("Produce message : %s", transferEvent.getMessageTime()));

    this.kafkaTemplate.send(TOPIC, transferEvent.toString());
  }

}
