package com.fwd.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=Use.LITERAL)
public interface SampleSoapInterface {
	
	@WebMethod
	public  InternalResponse wsdlcall(InternalRequest irq);
}
