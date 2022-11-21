package com.example.ruleengine.event;


import java.io.Serializable;

public abstract class EventRecord implements Serializable {

  private Long time;

  abstract void process(EventRecord eventRecord);

}
