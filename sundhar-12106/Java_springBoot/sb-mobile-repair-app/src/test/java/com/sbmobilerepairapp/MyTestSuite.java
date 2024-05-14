package com.sbmobilerepairapp;

import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SuiteClasses(value =  {SbMobileRepairAppApplicationTests.class,UserTest.class,AppointmentTest.class})
public class MyTestSuite {

}
