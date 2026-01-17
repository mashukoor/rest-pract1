package clients;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseApiClient {
    protected static Response post(String endpoint, Object body){
        return given()
                .spec(BaseAPI.getRequestSpecification())
                .body(body)
                .when()
                .post(endpoint);
    }
}
