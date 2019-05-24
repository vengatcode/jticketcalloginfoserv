package com.paypal.springbootstarter.callogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.paypal.springbootstarter.pojo.CalLogSummaryResponse;
import com.paypal.springbootstarter.pojo.CallSummary;
import com.paypal.springbootstarter.pojo.CorrCallSummary;
import com.paypal.springbootstarter.pojo.CorrelationResponse;
import com.paypal.springbootstarter.pojo.Corrsearchid;

@Component
public class CalLogsFilterForCtrl {
	
//	This method will filter the cal log summary and return necessary information
	public CalLogSummaryResponse getCalLogFilterSummary(CorrelationResponse correlationResponse){
		
		Gson gson = new Gson();
//		gson.toJson(correlationResponse);
		String jsonInString = gson.toJson(correlationResponse);
		System.out.println(jsonInString);

		Map<String, Corrsearchid> additionalProp = new HashMap<String, Corrsearchid>();
		CalLogSummaryResponse calLogSummaryResponse = new CalLogSummaryResponse();
		additionalProp = correlationResponse.getAdditionalProperties();
		for(Map.Entry<String, Corrsearchid> entry : additionalProp.entrySet()){
			
			System.out.println(entry.getKey() +" = "+ entry.getValue());
			Corrsearchid corrSearchId = entry.getValue();
			System.out.println(corrSearchId.getCallSummary());
			List<CorrCallSummary> listOfCallSummary = new ArrayList<CorrCallSummary>();
			listOfCallSummary = corrSearchId.getCallSummary();
			Iterator<CorrCallSummary> iterator = listOfCallSummary.iterator();
			while(iterator.hasNext()){
				CorrCallSummary corrCallSummary = iterator.next();
				if(corrCallSummary.getStatus() != 0 ){
					System.out.println(corrCallSummary.getPool() + " = " + corrCallSummary.getStatus());
					CallSummary callSummary = new CallSummary();
					callSummary.setPool(corrCallSummary.getPool());
					callSummary.setStatus(corrCallSummary.getStatus());
					callSummary.setLink(corrCallSummary.getLink());	
					calLogSummaryResponse.addCallSummary(callSummary);					
				}				
			}			
		}
		return calLogSummaryResponse;		
	}

}
