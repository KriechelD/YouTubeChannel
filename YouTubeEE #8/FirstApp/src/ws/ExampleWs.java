package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="DemoWebservice")
public class ExampleWs {

	@WebMethod(operationName="mirrorText")
	public String getText(String text) {
		return text;
	}
	
}
