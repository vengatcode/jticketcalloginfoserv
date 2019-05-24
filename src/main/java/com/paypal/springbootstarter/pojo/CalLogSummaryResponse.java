/**
 * 
 */
package com.paypal.springbootstarter.pojo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * @author vrathinavel
 *
 */
@Component
public class CalLogSummaryResponse {
	
	private Set<CallSummary> callSummary;
	
	public CalLogSummaryResponse() {
		callSummary = new HashSet<CallSummary>();
	}

	public Set<CallSummary> getCallSummary() {
		return callSummary;
	}

	public void setCallSummary(Set<CallSummary> callSummary) {
		this.callSummary = callSummary;
	}
	
	public void addCallSummary(CallSummary callSummary){
		this.callSummary.add(callSummary);
	}	

}
