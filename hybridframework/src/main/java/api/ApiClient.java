package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {

    public static int getStatusCode() {

        Response response =
                RestAssured
                .given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts");

        return response.getStatusCode();
    }
}