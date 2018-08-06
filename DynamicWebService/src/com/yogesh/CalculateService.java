package com.yogesh;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebFault;

@WebService
public interface CalculateService {

	@WebMethod(operationName="Addition")
	@WebResult(name="RESULT")
	public int add( @WebParam(name="A") int a, @WebParam(name="B") int b);
	
	@WebMethod(operationName="Division")
	@WebResult(name="RESULT")
	public double div(@WebParam(name="A") int a, @WebParam(name="B") int b) throws CustomException;
	
}
