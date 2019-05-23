package com.fwd.demo.ws;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;


@RestController
@RequestMapping("/rest")
public class RestAPI {

    @RequestMapping(path="/call", method= RequestMethod.POST)
	public InternalResponse restcall(@RequestBody InternalRequest irq) {
		InternalResponse irp = new InternalResponse();
		irp.setResult(true);
		return irp;
	}
	

}
