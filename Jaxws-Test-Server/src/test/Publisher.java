package test;

import javax.xml.ws.Endpoint;

public class Publisher {

	 public static void main(String[] args) {
	        Endpoint.publish("http://localhost:8080/Jaxws-Test-Server/TestServiceWS",
	                        new TestServiceImpl());
	    }
}
