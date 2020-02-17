
import com.intuit.karate.junit4.Karate;
import example.ExampleRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Karate.class)
@SuiteClasses({ ExampleRunner.class })
public class ExampleIT {}