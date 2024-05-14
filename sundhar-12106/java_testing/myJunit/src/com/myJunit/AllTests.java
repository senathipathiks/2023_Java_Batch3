package com.myJunit;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import com.myJunit.second.Test2;
import com.myJunit.third.Test3;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ Test1.class, Test2.class, Test3.class })
@ExcludePackages("com.myJunit.second")
public class AllTests {
	

}
