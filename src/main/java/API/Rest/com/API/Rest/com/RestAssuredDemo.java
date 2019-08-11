package API.Rest.com.API.Rest.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

public class RestAssuredDemo {
	
	@Test
	public static void getCall() {
		
		RestAssured.baseURI = "http://185.212.80.35:5000/STTC_CoverageService.svc";
		ResponseBody<?> re = RestAssured.given().get("GetGatewayConnectionList/0")
				.then().extract().response().body();
		System.out.println("Response \n" + re.asString());
		String connID = re.jsonPath().get("lstGatewayConnection[0].BrokerCalculationTime");
        String connID1 = re.jsonPath().get("lstGatewayConnection.BrokerCalculationTime");
		
		System.out.println(connID); 
		
	}
	
	/*public static void main (String[]args) {
		RestAssuredDemo.getCall();
		}
*/
}
