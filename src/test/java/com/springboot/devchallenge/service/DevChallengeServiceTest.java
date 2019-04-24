package com.springboot.devchallenge.service;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DevChallengeServiceTest {

  @Test
  public void get_multiple_of_two() {

    DevChallengeService devChallengeService = new DevChallengeService();
    Integer actual = devChallengeService.getMultipleOfTwo(2);
    assertTrue(actual==4);
  }

}
