package client;

import ws.DemoWebservice;
import ws.ExampleWs;

public class ClientWs {
	public static void main(String[] args) {
		ExampleWs exampleWs = new DemoWebservice().getExampleWsPort();
		
		System.out.println(exampleWs.mirrorText("Text from Client2"));
	}
}
