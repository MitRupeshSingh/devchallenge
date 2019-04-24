package com.springboot.devchallenge.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.springboot.devchallenge.service.DevChallengeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(MockitoJUnitRunner.class)
public class DevChallengeControllerTest {

  @Mock
  DevChallengeService devChallengeService;

  @InjectMocks
  DevChallengeController devChallengeController;

  @Test
  public void get_return_multiple_of_two() throws Exception{

    when(devChallengeService.getMultipleOfTwo(2)).thenReturn(4);
      getStandaloneMockMvcBuilder(devChallengeController)
          .build()
          .perform(get("/2"))
          .andExpect(status().isOk());
  }

  private StandaloneMockMvcBuilder getStandaloneMockMvcBuilder(Object controller) {
    return standaloneSetup(controller);
  }
}
