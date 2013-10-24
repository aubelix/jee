package test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TestService {
	@WebMethod
	public long sum(long a, long b);

}
