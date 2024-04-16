package com.firstPack;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;



@Suite
@SelectClasses({ Test1.class })
//@ExcludePackages("com.secondpack")
public class AllTests {

}
