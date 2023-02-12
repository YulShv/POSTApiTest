

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class POSTApiTest1 {
    @Test
    void shouldPostDemoAccount() {
        given()
                .baseUri("https://postman-echo.com")
                .body("demo account version 1")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("demo account"))
        ;

    }
}
