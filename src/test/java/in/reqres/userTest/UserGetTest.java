package in.reqres.userTest;


import in.reqres.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class UserGetTest  {
    static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "https://reqres.in";

        response = given()
                .when()
                .get("/users")
                .then().statusCode(200);}

    @Test
    public void test001(){
        response.body("page", equalTo(2));
    }




}
