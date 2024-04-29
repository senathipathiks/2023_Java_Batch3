package com.test;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.testthree.Testthree;
import com.testtwo.TestTwo;
@Suite
@ExcludePackages("com.testtwo")
@SelectClasses({ TestTestClass.class , Testthree.class, TestTwo.class })
public class AllTests {

}
