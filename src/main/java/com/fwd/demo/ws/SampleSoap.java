package com.fwd.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;

@WebService (endpointInterface="com.fwd.demo.ws.SampleSoapInterface")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=Use.LITERAL)
public class SampleSoap implements SampleSoapInterface{
	
	
	@Override
	@WebMethod
	public  InternalResponse wsdlcall(InternalRequest irq)  {
		InternalResponse irq2= new InternalResponse();
		irq2.setResult(true);
		return irq2;
	}
}
