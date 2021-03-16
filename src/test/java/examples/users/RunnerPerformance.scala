package examples.users

import com.intuit.karate.gatling.PreDef.karateFeature
import io.gatling.core.Predef.{Simulation, openInjectionProfileFactory, rampUsers, scenario}

import scala.concurrent.duration.{Duration, DurationInt, SECONDS}

class RunnerPerformance extends Simulation{

  val scenarioOne = scenario("temp").exec(karateFeature("classpath:examples/users/users.feature"))
  setUp(
    scenarioOne.inject(rampUsers(1).during(Duration(5, SECONDS)))
  )

}
