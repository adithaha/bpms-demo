
package com.redhat.nugraha.demo.bpms.permit.model.structural;

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
    "landArea",
    "buildingArea",
})
@XmlRootElement(name = "StructuralRequest")
public class StructuralRequest
    implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String address;
    private Integer landArea;
    private Integer buildingArea;
    
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
	public Integer getLandArea() {
		return landArea;
	}
	public void setLandArea(Integer landArea) {
		this.landArea = landArea;
	}
	public Integer getBuildingArea() {
		return buildingArea;
	}
	public void setBuildingArea(Integer buildingArea) {
		this.buildingArea = buildingArea;
	}

}
