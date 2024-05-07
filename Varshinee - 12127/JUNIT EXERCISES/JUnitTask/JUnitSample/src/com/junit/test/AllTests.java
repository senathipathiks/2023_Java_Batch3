package com.junit.test;


import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.firstpack.Test2;
import com.secondpack.Test3;

@Suite
@SelectClasses({ Test1.class ,Test2.class,Test3.class})
@ExcludePackages("com.secondpack")
public class AllTests {

}
