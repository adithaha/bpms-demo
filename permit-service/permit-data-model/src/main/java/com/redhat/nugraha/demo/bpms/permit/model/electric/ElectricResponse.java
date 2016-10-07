
package com.redhat.nugraha.demo.bpms.permit.model.electric;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "address",
    "status",
})
@XmlRootElement(name = "ElectricResponse")
public class ElectricResponse
    implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address;
    private String status;
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
	


}
