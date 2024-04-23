package com.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.junitsuite.firstpack.Test2;
import com.junitsuite.secondpack.Test3;

@Suite
@SelectClasses({ Test1.class,Test2.class,Test3.class })
//we don't want that package
//@ExcludePackages("com.junitsuite.secondpack")
public class AllTests {

}
