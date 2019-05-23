package com.fwd.demo.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.cxf.message.MessageContentsList;

import com.fwd.demo.beans.DataQuotation;
import com.fwd.demo.beans.DiscountParty;
import com.fwd.demo.beans.InsuranceLevy;
import com.fwd.demo.beans.InsuredSummary;
import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;
import com.fwd.demo.beans.Message;
import com.fwd.demo.beans.PlanBPriceInfo;
import com.fwd.demo.beans.PriceInfo;

public class MyRestOnlyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
	    restConfiguration()
			.component("spark-rest")
				.port(18080)
		;
		rest("/restCall")
			.post().produces("text/json").consumes("text/json")
			.bindingMode(RestBindingMode.json)
			.type(InternalRequest.class).outType(InternalResponse.class)
			.to("direct:restProcess")
		;		
		
		from("direct:restProcess")
		.process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
		        InternalResponse irq2= new InternalResponse();
		        irq2.setIsSystemError(false);
		        irq2.setSystemError(false);
				irq2.setResult(true);
				
				
				Message msg = new Message();
				msg.setErrorFlag(false);
				msg.setInformationFlag(false);
				msg.setWarningFlag(false);
				irq2.setMessage(msg);
				
				
				DataQuotation dataQuotation = new DataQuotation();
				dataQuotation.setBusinessSource(0);
				
				DiscountParty discountParty = new DiscountParty();
				discountParty.setType("DiscountParty:#ING.GI.Product.Schema");
				discountParty.setPromoteCode("");
				
				dataQuotation.setDiscountParty(discountParty);
				
				dataQuotation.setIsCommissionOverride(false);
				
				dataQuotation.setPolicyEndorsement(0);
				
				dataQuotation.setPolicyRenewal(0);
				
				PriceInfo priceInfo = new PriceInfo();
				
				priceInfo.setType("PriceInfo:#ING.GI.Product.Schema");
				priceInfo.setGrossPremium(145);
				priceInfo.setDirectDiscount(0);
				priceInfo.setDirectDAmount(0);
				priceInfo.setSaleDiscount(0);
				priceInfo.setSaleDAmount(0);
				priceInfo.setCommission(47.5);
				priceInfo.setCommissionAmount(68.88);
				priceInfo.setTotalDue(145.09);
				priceInfo.setAfterCoupon(0);
				priceInfo.setCommissionChange(47.5);
				priceInfo.setDirectDiscountChange(0);
				priceInfo.setLevy(0);
				priceInfo.setLevyAmount(0);
				priceInfo.setNetPremium(76.210000000000008);
				priceInfo.setTax(0);
				priceInfo.setTaxAmount(0);
				priceInfo.setCouponAmount(0);
				InsuranceLevy insuranceLevy = new InsuranceLevy();
				insuranceLevy.setLevyAmount(0.09);
				insuranceLevy.setLevyCap(3000.0);
				insuranceLevy.setLevyRate(0.06);
				insuranceLevy.setLevyEffectiveDate("/Date(1554048000000+0800)/");
				insuranceLevy.setLevyEffectiveDateStr("01/04/2019");
				priceInfo.setInsuranceLevy(insuranceLevy);
				
				dataQuotation.setPriceInfo(priceInfo);
				dataQuotation.setRequestVer(0);
				dataQuotation.setSystem("BrokerAPI");
				dataQuotation.setTransactionStatus(0);
				dataQuotation.setEWalletFlag(false);
				dataQuotation.setApproveDateStr("");
				dataQuotation.setChildCover(false);
				dataQuotation.setChildInput(0);
				dataQuotation.setCommencementDateStr("09/05/2019");
				dataQuotation.setCorporate(false);
				dataQuotation.setExpiryDateStr("11/05/2019");
				
				InsuredSummary insuredSummary = new InsuredSummary();
				insuredSummary.setType("InsuredSummary:#FWD.GI.TravelCare.Schema");
				insuredSummary.setChildCount(0);
				insuredSummary.setFamilyPlanPremium(0);
				insuredSummary.setFamilyPlanCount(0);
				insuredSummary.setFamilyPlanBPremium(0);
				insuredSummary.setIndividualPlanBPremium(115);
				insuredSummary.setIndividualPlanPremium(145);
				insuredSummary.setIndividualPlanCount(1);
				insuredSummary.setOtherCount(0);
				insuredSummary.setSpouseCount(0);
				insuredSummary.setSelfCount(0);
				insuredSummary.setWithChildPlanBPremium(0);
				insuredSummary.setWithChildPlanCount(0);
				insuredSummary.setWithChildPlanPremium(0);
				
				
				dataQuotation.setInsuredSummary(insuredSummary);
				
				dataQuotation.setIssueDateStr("");
				dataQuotation.setNoofday(3);
				dataQuotation.setOtherInput(0);
				dataQuotation.setPlan("A");
				dataQuotation.setPlanB("B");
				
				PlanBPriceInfo planBPriceInfo = new PlanBPriceInfo();
				planBPriceInfo.setType("PriceInfo:#ING.GI.Product.Schema");
				planBPriceInfo.setAfterCoupon(0);
				planBPriceInfo.setCommission(47.5);
				planBPriceInfo.setCommissionAmount(54.63);
				planBPriceInfo.setCommissionChange(47.5);
				planBPriceInfo.setCouponAmount(0);
				planBPriceInfo.setDirectDAmount(0);
				planBPriceInfo.setDirectDiscount(0);
				planBPriceInfo.setDirectDiscountChange(0);
				planBPriceInfo.setGrossPremium(115);
				planBPriceInfo.setGroupDAmount(0);
				planBPriceInfo.setGroupDiscount(0);
				planBPriceInfo.setGroupDiscountChange(0);
				planBPriceInfo.setLevy(0);
				planBPriceInfo.setLevyAmount(0);
				planBPriceInfo.setNetPremium(60.439999999999991);
				planBPriceInfo.setSaleDAmount(0);
				planBPriceInfo.setSaleDiscount(0);
				planBPriceInfo.setTax(0);
				planBPriceInfo.setTotalDue(115.07);
				InsuranceLevy insuranceLevy2 = new InsuranceLevy();
				insuranceLevy2.setLevyAmount(0.07);
				insuranceLevy2.setLevyCap(3000.0);
				insuranceLevy2.setLevyRate(0.0600);
				insuranceLevy2.setLevyEffectiveDate("/Date(1554048000000+0800)/");
				insuranceLevy2.setLevyEffectiveDateStr("");
				planBPriceInfo.setInsuranceLevy(insuranceLevy2)
				;
				dataQuotation.setPlanBPriceInfo(planBPriceInfo);
				dataQuotation.setSelfCover(true);
				dataQuotation.setSpouseCover(false);
				dataQuotation.setTransactionDateStr("01/04/2019");
				
				irq2.setDataQuotation(dataQuotation);
				
				exchange.getIn().setBody(irq2);
			}	
        } )
		;
	}

}
