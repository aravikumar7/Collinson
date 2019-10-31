package Sensyne;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static io.restassured.RestAssured.*;

public class getProduct {
    Response resp;
    String product;

    public void sendRequest(String arg0){
    RestAssured.baseURI = "http://localhost:5000";
    product=arg0;
    resp=given().
            header("Content-Type","application/json").
            when().
            get("/v1/product/"+product).
            then().
            extract().response();
}
public int validateResponse(){
    return resp.getStatusCode();
}

public boolean validateJson(){
    if (resp.contentType().contains("application/json"))
        return true;
    else
        return false;
}

public void validateJsonFormat(String schema){
    given().
            header("Content-Type","application/json").
            when().
            get("/v1/product/"+product).
            then().assertThat().
            body(matchesJsonSchema(schema));
}
}
