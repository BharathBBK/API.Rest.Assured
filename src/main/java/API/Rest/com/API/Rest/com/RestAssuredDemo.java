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
	

	public void post_Method() {
		System.out.println("add post method");
	}
	
	public void get_Method() {
		System.out.println("add post method");
	}
	
	
	/*public static void main (String[]args) {
=======
	
	public void post_method() {
		System.out.println("add post method");
	}
	
	public static void main (String[]args) {
>>>>>>> 3c4174097f33da30bffb66f23670852348b135b5
		RestAssuredDemo.getCall();
		}
*/
}
