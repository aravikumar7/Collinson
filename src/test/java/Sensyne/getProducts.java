package Sensyne;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class getProducts {
    Response resp;

    public void sendRequest(){
    RestAssured.baseURI = "http://localhost:5000";
    resp=given().
            header("Content-Type","application/json").
            when().
            get("/v1/products").
            then().
            extract().response();
}
public int validateResponse(){
System.out.println(resp.getStatusCode());
 System.out.println(resp);
    return resp.getStatusCode();
}

public boolean validateJson(){
    if (resp.contentType().contains("application/json"))
        return true;
    else
        return false;
}
}
