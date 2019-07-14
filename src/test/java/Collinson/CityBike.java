package Collinson;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.*;

public class CityBike{
    Response resp;
    String country;
    String response;
    JsonPath js;

    public void sendRequest(){
    RestAssured.baseURI = "http://api.citybik.es";
    resp=given().
            header("Content-Type","application/json").
            when().
            get("/v2/networks").
            then().assertThat().
            statusCode(200).
            extract().response();
}
public int validateResponse(){
System.out.println(resp.getStatusCode());
    return resp.getStatusCode();
}

    public void requestCountry(){
        response=resp.asString();
        js= new JsonPath(response);
        List<String> City = js.getList("networks.location.city");
        for (String city: City) {
            System.out.println(city);
        }
        }
public String verifyCity(String arg0){
    response=resp.asString();
    js= new JsonPath(response);
    List<HashMap<String, Object>> data = js.getList("networks.location");
    for (HashMap<String, Object> cityData : data) {
        if (cityData.get("city").equals("Frankfurt")) {
            country=cityData.get("country").toString();
            System.out.println("Latitude is : " + cityData.get("latitude"));
            System.out.println("Longitude is : " + cityData.get("longitude"));
            break;
        }
    }
    return country;
}
}
