//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The provisions related to the holding and usage of posted collateral.
 * 
 * <p>Java class for HoldingAndUsingPostedCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoldingAndUsingPostedCollateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/master}PartyReference" minOccurs="0"/>
 *         &lt;element name="eligibilityToHoldCollateral" type="{http://www.fpml.org/FpML-5/master}EligibilityToHoldCollateral" minOccurs="0"/>
 *         &lt;element name="useOfPostedCollateral" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingAndUsingPostedCollateral", propOrder = {
    "partyReference",
    "eligibilityToHoldCollateral",
    "useOfPostedCollateral"
})
public class HoldingAndUsingPostedCollateral {

    protected PartyReference partyReference;
    protected EligibilityToHoldCollateral eligibilityToHoldCollateral;
    protected Boolean useOfPostedCollateral;

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the eligibilityToHoldCollateral property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityToHoldCollateral }
     *     
     */
    public EligibilityToHoldCollateral getEligibilityToHoldCollateral() {
        return eligibilityToHoldCollateral;
    }

    /**
     * Sets the value of the eligibilityToHoldCollateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityToHoldCollateral }
     *     
     */
    public void setEligibilityToHoldCollateral(EligibilityToHoldCollateral value) {
        this.eligibilityToHoldCollateral = value;
    }

    /**
     * Gets the value of the useOfPostedCollateral property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOfPostedCollateral() {
        return useOfPostedCollateral;
    }

    /**
     * Sets the value of the useOfPostedCollateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOfPostedCollateral(Boolean value) {
        this.useOfPostedCollateral = value;
    }

}
