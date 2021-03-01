package examples.users;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;


@RunWith(Karate.class)
@CucumberOptions(
      plugin =  {"json:target/cucum.json"}
)
public class UsersRunner {
    


}
