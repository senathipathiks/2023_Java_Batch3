import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.firstpack.Test2;
import com.secondpack.Test3;


@Suite
@SelectClasses({ Test1.class ,Test2.class,Test3.class })
public class AllTests {

}
