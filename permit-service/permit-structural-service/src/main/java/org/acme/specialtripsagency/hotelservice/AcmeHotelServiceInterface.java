package org.acme.specialtripsagency.hotelservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.17.redhat-1
 * 2016-02-05T22:11:52.861+01:00
 * Generated source version: 2.7.17.redhat-1
 * 
 */
@WebService(targetNamespace = "urn:specialtripsagency.acme.org:hotelservice", name = "AcmeHotelServiceInterface")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AcmeHotelServiceInterface {

    @WebMethod(action = "urn:specialtripsagency.acme.org:hotelservice:getAvailableHotels")
    @WebResult(name = "Hotel", targetNamespace = "urn:specialtripsagency.acme.org:hotelservice", partName = "parameters")
    public Hotel getAvailableHotels(
        @WebParam(partName = "parameters", name = "HotelRequest", targetNamespace = "urn:specialtripsagency.acme.org:hotelservice")
        HotelRequest parameters
    );

    @WebMethod(action = "urn:specialtripsagency.acme.org:hotelservice:cancelBooking")
    @WebResult(name = "BookingCancellationResponse", targetNamespace = "urn:specialtripsagency.acme.org:hotelservice", partName = "parameters")
    public BookingCancellationResponse cancelBooking(
        @WebParam(partName = "parameters", name = "BookingCancellation", targetNamespace = "urn:specialtripsagency.acme.org:hotelservice")
        BookingCancellation parameters
    );

    @WebMethod(action = "urn:specialtripsagency.acme.org:hotelservice:bookHotel")
    @WebResult(name = "HotelBookingResponse", targetNamespace = "urn:specialtripsagency.acme.org:hotelservice", partName = "parameters")
    public HotelBookingResponse bookHotel(
        @WebParam(partName = "parameters", name = "HotelBooking", targetNamespace = "urn:specialtripsagency.acme.org:hotelservice")
        HotelBooking parameters
    );
}
