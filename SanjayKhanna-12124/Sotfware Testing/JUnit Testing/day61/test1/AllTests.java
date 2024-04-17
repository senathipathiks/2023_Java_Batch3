package com.junit.day61.test1;


import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.Suite;

import com.junit.day61.test2.TestClass2;
import com.junit.day61.test3.TestClass3;

@Suite
@SelectClasses({ TestClass1.class, TestClass2.class, TestClass3.class })
@ExcludePackages("com.junit.day61.test3")
public class AllTests {

}
