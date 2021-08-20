import User.CreateLoginSuccesful;
import User.CreateUserRequestBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateResponse {
    @Test
    public void shouldCreateUser(){
        CreateUserRequestBody requestBody =CreateUserRequestBody.builder().name("morpheus").job("leader").build();

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("https://reqres.in/api/users");

      String name = response.getBody().jsonPath().get("name").toString();
        System.out.println(name);
      Assert.assertEquals(name,requestBody.getName());
    }
    @Test
    public void shouldLogin(){
        CreateLoginSuccesful requestBody = CreateLoginSuccesful.builder().email("eve.holt@reqres.in").password("cityslicka").build();

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody).post("https://reqres.in/api/login");
        String token = response.getBody().jsonPath().get("token").toString();
        System.out.println(token);
        Assert.assertNotNull(token);

    }
}
