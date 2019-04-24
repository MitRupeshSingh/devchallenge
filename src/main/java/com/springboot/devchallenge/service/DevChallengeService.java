package com.springboot.devchallenge.service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DevChallengeService {

  public Integer getMultipleOfTwo(int number) {
    return number * 2;
  }
}
