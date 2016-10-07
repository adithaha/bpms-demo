
package com.redhat.nugraha.demo.bpms.permit.model.electric;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "address",
    "power",
})
@XmlRootElement(name = "ElectricRequest")
public class ElectricRequest
    implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String address;
    private Integer power;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}

}
