package com.fwd.demo.routes;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.cxf.message.MessageContentsList;

import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;
import com.fwd.demo.ws.SampleSoap;


/**
 * 
 
 Internal Request
----------------
{
  "__type" : "InputFWDQuote:#FWD.GI.Common.Schema",
  "AppFrom" : "CustomerPortal",
  "Channel" : "Web",
  "Company" : "",
  "Lang" : "EN",
  "ProductName" : "TravelCare",
  "System" : "BrokerAPI",
  "UserID" : "HKXXXX",
  "Source" : "HKXXXX",
  "DataQuotation" : {
    "__type" : "DataQuotation:#FWD.GI.TravelCare.Schema",
    "DiscountParty" : {
      "__type" : "DiscountParty:#ING.GI.Product.Schema",
      "PromoteCode" : ""
    },
    "ChildCover" : false,
    "ChildInput" : 0,
    "CommencementDateStr" : "09/05/2019",
    "ExpiryDateStr" : "11/05/2019",
    "InsuredSummary" : {
      "__type" : "InsuredSummary:#FWD.GI.TravelCare.Schema"
    },
    "OtherInput" : 0,
    "Plan" : "A",
    "PlanB" : "B",
    "PlanBPriceInfo" : {
      "__type" : "PriceInfo:#ING.GI.Product.Schema"
    },
    "SelfCover" : true,
    "SpouseCover" : false
  }
}

Internal Response
------------------
{
  "systemError" : false,
  "IsSystemError" : false,
  "Result" : true,
  "Message" : {
    "ErrorAction" : [ ],
    "ErrorFlag" : false,
    "ErrorMessage" : [ ],
    "ErrorCode" : [ ],
    "InformationFlag" : false,
    "InformationMessage" : [ ],
    "WarningFlag" : false,
    "WarningMessage" : [ ]
  },
  "DataQuotation" : {
    "__type" : "DataQuotation:#FWD.GI.TravelCare.Schema",
    "BusinessSource" : 0,
    "DiscountParty" : {
      "__type" : "DiscountParty:#ING.GI.Product.Schema",
      "PromoteCode" : ""
    },
    "Intermediary" : {
      "__type" : "Intermediary:#ING.GI.Product.Schema",
      "Name" : "*XXX limited",
      "Code" : "HKXXXX"
    },
    "IsCommissionOverride" : false,
    "PolicyEndorsement" : 0,
    "PolicyRenewal" : 0,
    "PriceInfo" : {
      "__type" : "PriceInfo:#ING.GI.Product.Schema",
      "GrossPremium" : 145,
      "DirectDiscount" : 0,
      "DirectDAmount" : 0,
      "SaleDiscount" : 0,
      "SaleDAmount" : 0,
      "Commission" : 47.5,
      "CommissionAmount" : 68.88,
      "TotalDue" : 145.09,
      "AfterCoupon" : 0,
      "CommissionChange" : 47.5,
      "DirectDiscountChange" : 0,
      "GroupDAmount" : 0,
      "GroupDiscount" : 0,
      "GroupDiscountChange" : 0,
      "Levy" : 0,
      "LevyAmount" : 0,
      "NetPremium" : 76.210000000000008,
      "Tax" : 0,
      "TaxAmount" : 0,
      "CouponAmount" : 0,
      "InsuranceLevy" : {
        "LevyAmount" : 0.09,
        "LevyCap" : 3000.0,
        "LevyRate" : 0.0600,
        "LevyEffectiveDate" : "/Date(1554048000000+0800)/",
        "LevyEffectiveDateStr" : "01/04/2019"
      }
    },
    "RequestVer" : 0,
    "System" : "BrokerAPI",
    "TransactionStatus" : 0,
    "eWalletFlag" : false,
    "ApproveDateStr" : "",
    "ChildCover" : false,
    "ChildInput" : 0,
    "CommencementDateStr" : "09/05/2019",
    "Corporate" : false,
    "ExpiryDateStr" : "11/05/2019",
    "InsuredSummary" : {
      "__type" : "InsuredSummary:#FWD.GI.TravelCare.Schema",
      "ChildCount" : 0,
      "FamilyPlanBPremium" : 0,
      "FamilyPlanCount" : 0,
      "FamilyPlanPremium" : 0,
      "IndividualPlanBPremium" : 115,
      "IndividualPlanCount" : 1,
      "IndividualPlanPremium" : 145,
      "OtherCount" : 0,
      "SelfCount" : 1,
      "SpouseCount" : 0,
      "WithChildPlanBPremium" : 0,
      "WithChildPlanCount" : 0,
      "WithChildPlanPremium" : 0
    },
    "IssueDateStr" : "",
    "Noofday" : 3,
    "OtherInput" : 0,
    "Plan" : "A",
    "PlanB" : "B",
    "PlanBPriceInfo" : {
      "__type" : "PriceInfo:#ING.GI.Product.Schema",
      "AfterCoupon" : 0,
      "Commission" : 47.5,
      "CommissionAmount" : 54.63,
      "CommissionChange" : 47.5,
      "CouponAmount" : 0,
      "DirectDAmount" : 0,
      "DirectDiscount" : 0,
      "DirectDiscountChange" : 0,
      "GrossPremium" : 115,
      "GroupDAmount" : 0,
      "GroupDiscount" : 0,
      "GroupDiscountChange" : 0,
      "Levy" : 0,
      "LevyAmount" : 0,
      "NetPremium" : 60.439999999999991,
      "SaleDAmount" : 0,
      "SaleDiscount" : 0,
      "Tax" : 0,
      "TaxAmount" : 0,
      "TotalDue" : 115.07,
      "InsuranceLevy" : {
        "LevyAmount" : 0.07,
        "LevyCap" : 3000.0,
        "LevyRate" : 0.0600,
        "LevyEffectiveDate" : "/Date(1554048000000+0800)/",
        "LevyEffectiveDateStr" : "01/04/2019"
      }
    },
    "SelfCover" : true,
    "SpouseCover" : false,
    "TransactionDateStr" : ""
  }
}

 
 *
 */
public class MyWebServiceRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://0.0.0.0:18081/soap");
        cxfEndpoint.setServiceClass(SampleSoap.class);
        cxfEndpoint.setCamelContext(getContext());
        cxfEndpoint.setDataFormat(DataFormat.POJO);
        JacksonDataFormat formatResponse = new JacksonDataFormat(InternalResponse.class); formatResponse.setAllowJmsType(true);
        JacksonDataFormat formatResquest = new JacksonDataFormat(InternalRequest.class); formatResquest.setAllowJmsType(true);

        restConfiguration()
		.component("spark-rest")
			.port(8088)
		;
		rest("/rest2soap")
			.post().produces("text/json").consumes("text/json")
//			.bindingMode(RestBindingMode.json)
//			.type(InternalRequest.class).outType(InternalResponse.class)
			.to("direct:rest2SoapProcess")			
		;	
		
		from("direct:rest2SoapProcess")
		.setExchangePattern(ExchangePattern.InOut)
		//.unmarshal(formatResquest)
        .split().jsonpath("$").streaming().parallelProcessing()
        .marshal(formatResquest)
        .convertBodyTo(String.class)
        .unmarshal(formatResquest)
     	//.to("direct:rest-soap-to-soap")
		.setExchangePattern(ExchangePattern.InOut)
        .aggregate(constant(true),new MyAggregationStragegy())
	     .completionSize(2)
     	.to("direct:rest-soap-to-soap")
	    .marshal(formatResponse)
		.convertBodyTo(String.class)
	    .log("after aggregate ${body}")
		.unmarshal(formatResponse)
	    .log("${body}");
		;
		
		from("direct:rest-soap-to-soap")
		.setExchangePattern(ExchangePattern.InOut)
		.log("body ${body}")
		.marshal(formatResquest)
		.unmarshal(formatResquest)
		.process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				InternalRequest irq = exchange.getIn().getBody(InternalRequest.class);
				exchange.getIn().setBody(irq);
			}	
        } )
		.to(cxfEndpoint)
		.process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
		        MessageContentsList msgList = (MessageContentsList)exchange.getIn().getBody();

		        InternalResponse internalResponse = (InternalResponse)msgList.get(0);
		       
				exchange.getIn().setBody(internalResponse);
			}	
        })
		
		;
			
			
	}

}
