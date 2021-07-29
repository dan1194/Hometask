package com.test.api;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class HomeTask {
     static String baseURI = "http://localhost:8080/";
     static String basePath;

    @Test(enabled = false)
    public void getAllProduct() {
        basePath = "get_products";
        Response response = given().when().get().then().statusCode(200).extract().response();
        System.out.println(response.asString());
    }

    @Test(enabled = false)
    public void getSingleProduct() {
        basePath = "get_products";
        Response response = given().when().get().then().statusCode(200).extract().response();
        System.out.println(response.asString());
    }

    @Test(enabled = false)
    public void addProduct() {
        Response response = given()
                .param("name", "Danish Product")
                .param("Price", 200)
                .param("Description", "Testing Home task")
                .post("/save")
                .then().extract().response();
        System.out.println(response.asString());
    }

    @Test(enabled = false)
    public void editProduct() {
        Response response = given()
                .param("name", "Danish Product1")
                .param("Price", 201)
                .param("Description", "Testing Home task1")
                .post("/update/3")
                .then()
                .extract().
                response();
        System.out.println(response.asString());
    }

    @Test(enabled = true)
    public void deleteProduct() {
        Response response = given().
                when().
                get("/delete/3").
                then().
                extract()
                .response();
        System.out.println(response.asString());
    }
}