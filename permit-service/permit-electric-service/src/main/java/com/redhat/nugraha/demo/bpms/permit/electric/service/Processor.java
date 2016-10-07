package com.redhat.nugraha.demo.bpms.permit.electric.service;

import org.apache.camel.Body;
import org.apache.camel.ExchangeProperty;

import com.redhat.nugraha.demo.bpms.permit.model.electric.ElectricRequest;
import com.redhat.nugraha.demo.bpms.permit.model.electric.ElectricResponse;

public class Processor {

	public ElectricResponse generateResponse(
			@Body ElectricRequest request,
			@ExchangeProperty(value="BPMS_status") String status
			) {
		ElectricResponse response = new ElectricResponse();
		response.setAddress(request.getAddress());
		response.setStatus(status);
		return response;
	}
}
