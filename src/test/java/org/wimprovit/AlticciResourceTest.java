package org.wimprovit;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class AlticciResourceTest {

    @Test
    public void testAlticciEndpoint() {
        given()
                .pathParam("n", 0)
                .when().get("/wimprovit/alticci/{n}")
                .then()
                .statusCode(200);
    }

}