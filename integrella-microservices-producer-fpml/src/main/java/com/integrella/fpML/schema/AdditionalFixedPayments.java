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
 * <p>Java class for AdditionalFixedPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFixedPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestShortfallReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="principalShortfallReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writedownReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFixedPayments", propOrder = {
    "interestShortfallReimbursement",
    "principalShortfallReimbursement",
    "writedownReimbursement"
})
public class AdditionalFixedPayments {

    protected Boolean interestShortfallReimbursement;
    protected Boolean principalShortfallReimbursement;
    protected Boolean writedownReimbursement;

    /**
     * Gets the value of the interestShortfallReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestShortfallReimbursement() {
        return interestShortfallReimbursement;
    }

    /**
     * Sets the value of the interestShortfallReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestShortfallReimbursement(Boolean value) {
        this.interestShortfallReimbursement = value;
    }

    /**
     * Gets the value of the principalShortfallReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipalShortfallReimbursement() {
        return principalShortfallReimbursement;
    }

    /**
     * Sets the value of the principalShortfallReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalShortfallReimbursement(Boolean value) {
        this.principalShortfallReimbursement = value;
    }

    /**
     * Gets the value of the writedownReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWritedownReimbursement() {
        return writedownReimbursement;
    }

    /**
     * Sets the value of the writedownReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritedownReimbursement(Boolean value) {
        this.writedownReimbursement = value;
    }

}
