import User.UpdateUserRequestBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class updateResponse {
    @Test
    public void updateJob(){

        UpdateUserRequestBody requestBody =
                UpdateUserRequestBody.builder().name("morpheus").job("zion resident").build();
        Response response = given().contentType(ContentType.JSON)
                .body(requestBody)
                .put("https://reqres.in/api/users/2")
                .then().assertThat().statusCode(200).extract().response();
        String job = response.getBody().jsonPath().get("job").toString();
        System.out.println(job);
        Assert.assertEquals(job,requestBody.getJob());
    }
}
