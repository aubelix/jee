package test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "test.TestService", serviceName = "TestServiceWS")
public class TestServiceImpl implements TestService {

	@Override
	@WebMethod
	public long sum(long a, long b) {
		return a + b;
	}

}
