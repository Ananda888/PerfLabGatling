package scenarios


import com.intuit.karate.gatling.KarateProtocol
import com.intuit.karate.gatling.PreDef.*
import io.gatling.core.Predef.*
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef.*
import io.gatling.http.protocol.HttpProtocolBuilder

object login
{
  val httpProtocol: HttpProtocolBuilder = http.baseUrl("https://reqres.in")

  

  val post_login: ScenarioBuilder = scenario("Login")
    .exec(http("POST /api/login")
      .post("/api/login")
      .body(StringBody("""{ "email": "eve.holt@reqres.in","password": "cityslicka"} """)).asJson
      .check(status.is(200))
    ).pause(30, 33)


}