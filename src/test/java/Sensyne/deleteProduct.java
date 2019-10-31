package Sensyne;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class deleteProduct {
    Response resp;

    public void sendRequest(String arg0){
    RestAssured.baseURI = "http://localhost:5000";
    resp=given().
            header("Content-Type","application/json").
            when().
            delete("/v1/product/"+arg0).
            then().
            extract().response();
}
public int validateResponse(){
System.out.println(resp.getStatusCode());
 System.out.println(resp);
    return resp.getStatusCode();
}
}