package com.example.ruleengine.event;

import lombok.Data;
import lombok.Getter;

@Getter
public class TransferEvent extends EventRecord {

  private long messageTime;

  public TransferEvent() {
    this.messageTime = System.currentTimeMillis();
  }

  @Override
  void process(EventRecord eventRecord) {
    System.out.println("TransferEvent consumed" + messageTime);

  }
}
