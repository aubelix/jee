package test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Service s = Service.create(new URL("http://localhost:8080/Jaxws-Test-Server/TestServiceWS"), new QName("http://test/", "TestServiceWS"));
		System.out.println(s.getPort(TestService.class).sum(1, 2));
		
	}

}
