package examples.users;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(
      plugin =  {"json:target/cucumber-2.json"}
)
public class UsersRunner {
    


}
