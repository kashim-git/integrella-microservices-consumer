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
 * Describes an observation that caused a barrier knock out to trigger
 * 
 * <p>Java class for KnockOutRateObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnockOutRateObservation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}TriggerRateObservation">
 *       &lt;sequence>
 *         &lt;element name="rebatePayment" type="{http://www.fpml.org/FpML-5/master}NonNegativePayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnockOutRateObservation", propOrder = {
    "rebatePayment"
})
public class KnockOutRateObservation
    extends TriggerRateObservation
{

    protected NonNegativePayment rebatePayment;

    /**
     * Gets the value of the rebatePayment property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativePayment }
     *     
     */
    public NonNegativePayment getRebatePayment() {
        return rebatePayment;
    }

    /**
     * Sets the value of the rebatePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativePayment }
     *     
     */
    public void setRebatePayment(NonNegativePayment value) {
        this.rebatePayment = value;
    }

}
