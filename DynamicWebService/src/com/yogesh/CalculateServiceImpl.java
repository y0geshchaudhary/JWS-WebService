package com.yogesh;

import javax.jws.WebService;

@WebService(endpointInterface="com.yogesh.CalculateService", name="CalculateServiceImpl",
portName="CalculateServicePort",serviceName="CalculateService")
public class CalculateServiceImpl implements CalculateService {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public double div(int a, int b) throws CustomException {
		
		if(b==0) throw new CustomException("Divisor cannot be Zero","DivideByZeroException");
		return (double)a/(double)b;
	}

}
