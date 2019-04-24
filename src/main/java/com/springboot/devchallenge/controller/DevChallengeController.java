package com.springboot.devchallenge.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.springboot.devchallenge.service.DevChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevChallengeController {

  private DevChallengeService devChallengeService;

  @Autowired
  public DevChallengeController(DevChallengeService devChallengeService) {
    this.devChallengeService = devChallengeService;
  }

  @RequestMapping(value = "/{number}", method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
  public Integer getMultipleOfTwo(@PathVariable final int number) {
    return devChallengeService.getMultipleOfTwo(number);
  }
}
