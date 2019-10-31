package Sensyne;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class createProduct {
    Response resp;

    public void sendRequest(String arg0,String arg1,String arg2){
    RestAssured.baseURI = "http://localhost:5000";
    String product="{" +
            "\"name\":\"" + arg1 + "\"," +
                "\"price\":" + arg2 + "," +
                "\"product\":\"" + arg0 + "\"" +
"}";
    resp=given().
            header("Content-Type","application/json").
            body(product).
            when().
            post("/v1/product").
            then().
            extract().response();
}
public int validateResponse(){
    return resp.getStatusCode();
}
}
