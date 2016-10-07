package com.redhat.nugraha.demo.bpms.permit.electric.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.redhat.nugraha.demo.bpms.permit.model.electric.ElectricRequest;
import com.redhat.nugraha.demo.bpms.permit.model.electric.ElectricResponse;


@WebService(targetNamespace = "http://redhat.com/anugraha/demo/bpms/permit", name = "ElectricServiceWS")
public interface ServiceWS {

	@WebResult(name = "electricResponse", targetNamespace = "http://redhat.com/anugraha/demo/bpms/permit")
	@WebMethod(operationName = "register")
	ElectricResponse register(
			@WebParam(name = "electricRequest", targetNamespace = "http://redhat.com/anugraha/demo/bpms/permit")
			ElectricRequest request);
	
	@WebResult(name = "electricResponse", targetNamespace = "http://redhat.com/anugraha/demo/bpms/permit")
	@WebMethod(operationName = "getStatus")
	ElectricResponse getStatus(
			@WebParam(name = "electricRequest", targetNamespace = "http://redhat.com/anugraha/demo/bpms/permit")
			ElectricRequest request);

}