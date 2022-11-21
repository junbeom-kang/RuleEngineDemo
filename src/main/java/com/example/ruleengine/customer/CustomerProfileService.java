package com.example.ruleengine.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerProfileService {

  private final CustomerProfileRepository customerProfileRepository;

  public void setCustomerProfile(long customerProfileId, CustomerProfile customerProfile) {
  }


}
