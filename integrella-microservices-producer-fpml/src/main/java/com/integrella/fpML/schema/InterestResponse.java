//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestResponseReason" type="{http://www.fpml.org/FpML-5/master}InterestResponseReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestResponse", propOrder = {
    "interestApproved",
    "interestResponseReason"
})
public class InterestResponse {

    protected Boolean interestApproved;
    protected List<InterestResponseReason> interestResponseReason;

    /**
     * Gets the value of the interestApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestApproved() {
        return interestApproved;
    }

    /**
     * Sets the value of the interestApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestApproved(Boolean value) {
        this.interestApproved = value;
    }

    /**
     * Gets the value of the interestResponseReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestResponseReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestResponseReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestResponseReason }
     * 
     * 
     */
    public List<InterestResponseReason> getInterestResponseReason() {
        if (interestResponseReason == null) {
            interestResponseReason = new ArrayList<InterestResponseReason>();
        }
        return this.interestResponseReason;
    }

}
