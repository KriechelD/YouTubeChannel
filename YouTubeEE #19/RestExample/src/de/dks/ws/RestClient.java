package de.dks.ws;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

@ApplicationScoped
@ManagedBean
public class RestClient {

	public void call() {
		Client client = ClientBuilder.newClient();

		SimpleObject o = client.target("http://localhost:8080/RestExample/resources/MyRestService/object").request().get(SimpleObject.class);
		
		System.out.println(o);
	}
	
}
