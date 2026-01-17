package clients;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilites.ConfigReader;

public class AddOrderClient extends BaseApiClient{
    private static final String ADD_ORDER_ENDPOINT = "/addOrder";
    public static Response addOrder(String body){
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(body)
                .when()
                .post(ConfigReader.get("add.order.endpoint"))
                .then().statusCode(201)
                .extract().response();
    }
    public static Response addOrders(Object body){

        return post(ADD_ORDER_ENDPOINT,body);
    }
}
