package com.example.ruleengine.Generator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GeneratorController {

  private final EventGenerator eventGenerator;

  @GetMapping("/generate")
  public String generateData(){
    eventGenerator.sendMessage();
    System.out.println("hi");
    return "hi";

  }

}
