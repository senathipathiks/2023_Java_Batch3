package Com.demo;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import Com.test.TestDemo;
import Com.test2.Test2Demo;
import Com.test3.Test3Demp;

@Suite
@SelectClasses({ TestDemo.class, Test2Demo.class, Test3Demp.class })
@ExcludePackages("Com.test2")
public class AllTests {

	
}
