package junit;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.first.Test2;
import com.second.Test3;

@Suite
@SelectClasses({ Test1.class, Test2.class, Test3.class })
@ExcludePackages("com.second")
public class AllTests {

}
