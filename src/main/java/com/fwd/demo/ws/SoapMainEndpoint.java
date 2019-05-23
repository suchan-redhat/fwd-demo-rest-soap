package com.fwd.demo.ws;

import javax.xml.ws.Endpoint;


public class SoapMainEndpoint {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/hello", new SampleSoap());
	    }
}
