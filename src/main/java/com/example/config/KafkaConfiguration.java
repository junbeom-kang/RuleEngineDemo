package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

  @Value("${spring.kafka.bootstrap-servers}")
  private String bootstrapServer;

  public String getBootstrapServer() {
    return bootstrapServer;
  }
}
