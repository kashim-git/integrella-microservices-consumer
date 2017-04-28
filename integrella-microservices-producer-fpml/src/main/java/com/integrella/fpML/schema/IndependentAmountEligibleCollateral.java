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
 * A type to specify the eligible collateral.
 * 
 * <p>Java class for IndependentAmountEligibleCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndependentAmountEligibleCollateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/master}PartyReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="eligibleCollateral" type="{http://www.fpml.org/FpML-5/master}EligibleCollateral" maxOccurs="unbounded"/>
 *           &lt;element name="independentAmountEligibility" type="{http://www.fpml.org/FpML-5/master}IndependentAmountEligibility"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndependentAmountEligibleCollateral", propOrder = {
    "partyReference",
    "eligibleCollateral",
    "independentAmountEligibility"
})
public class IndependentAmountEligibleCollateral {

    protected PartyReference partyReference;
    protected List<EligibleCollateral> eligibleCollateral;
    protected IndependentAmountEligibility independentAmountEligibility;

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
     * Gets the value of the eligibleCollateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleCollateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligibleCollateral }
     * 
     * 
     */
    public List<EligibleCollateral> getEligibleCollateral() {
        if (eligibleCollateral == null) {
            eligibleCollateral = new ArrayList<EligibleCollateral>();
        }
        return this.eligibleCollateral;
    }

    /**
     * Gets the value of the independentAmountEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmountEligibility }
     *     
     */
    public IndependentAmountEligibility getIndependentAmountEligibility() {
        return independentAmountEligibility;
    }

    /**
     * Sets the value of the independentAmountEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmountEligibility }
     *     
     */
    public void setIndependentAmountEligibility(IndependentAmountEligibility value) {
        this.independentAmountEligibility = value;
    }

}
