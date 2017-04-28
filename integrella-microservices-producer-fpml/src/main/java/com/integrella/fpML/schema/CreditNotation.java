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
 * The credit rating notation base construct, which includes agency, notation, scale and debt type qualifications.
 * 
 * <p>Java class for CreditNotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditNotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agency" type="{http://www.fpml.org/FpML-5/master}CreditRatingAgency" minOccurs="0"/>
 *         &lt;element name="notation" type="{http://www.fpml.org/FpML-5/master}CreditRatingNotation" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.fpml.org/FpML-5/master}CreditRatingScale" minOccurs="0"/>
 *         &lt;element name="debt" type="{http://www.fpml.org/FpML-5/master}CreditRatingDebt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditNotation", propOrder = {
    "agency",
    "notation",
    "scale",
    "debt"
})
public class CreditNotation {

    protected CreditRatingAgency agency;
    protected CreditRatingNotation notation;
    protected CreditRatingScale scale;
    protected CreditRatingDebt debt;

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRatingAgency }
     *     
     */
    public CreditRatingAgency getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRatingAgency }
     *     
     */
    public void setAgency(CreditRatingAgency value) {
        this.agency = value;
    }

    /**
     * Gets the value of the notation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRatingNotation }
     *     
     */
    public CreditRatingNotation getNotation() {
        return notation;
    }

    /**
     * Sets the value of the notation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRatingNotation }
     *     
     */
    public void setNotation(CreditRatingNotation value) {
        this.notation = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRatingScale }
     *     
     */
    public CreditRatingScale getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRatingScale }
     *     
     */
    public void setScale(CreditRatingScale value) {
        this.scale = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRatingDebt }
     *     
     */
    public CreditRatingDebt getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRatingDebt }
     *     
     */
    public void setDebt(CreditRatingDebt value) {
        this.debt = value;
    }

}
