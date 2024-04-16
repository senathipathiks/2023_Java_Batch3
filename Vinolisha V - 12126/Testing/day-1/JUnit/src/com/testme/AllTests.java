package com.testme;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.secondpack.Test2;
import com.thirdpack.Test3;

@Suite
@SelectClasses({ TestTestMe.class, Test2.class, Test3.class})
@ExcludePackages("com.secondpack")
public class AllTests {

}
