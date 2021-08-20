import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteResponse {
    @Test
    public void delete(){
        Response response = given().delete("https://reqres.in/api/users/2")
                .then().assertThat().statusCode(204).extract().response();
    }
}
