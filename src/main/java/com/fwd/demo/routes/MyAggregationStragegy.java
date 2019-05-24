package com.fwd.demo.routes;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;

public class MyAggregationStragegy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		System.out.println("EXchanging !!!!!!!!!!!");
		if (oldExchange == null) {
			System.out.println("Old Exhcange null !!!!!!!!!!!");

			InternalRequest irp = newExchange.getIn().getBody(InternalRequest.class);
			newExchange.getOut().setBody(irp);
			
			return newExchange;
		} else {
			System.out.println("gooood !!!!!!!!!!!");

			InternalRequest irp = newExchange.getIn().getBody(InternalRequest.class);
			InternalRequest irp2 = oldExchange.getIn().getBody(InternalRequest.class);
			
			String newSystem = irp.getAppFrom() + " " + irp2.getAppFrom();
			irp2.setAppFrom(newSystem);
			oldExchange.getOut().setBody(irp2);
			return oldExchange;
		}
	}

}
