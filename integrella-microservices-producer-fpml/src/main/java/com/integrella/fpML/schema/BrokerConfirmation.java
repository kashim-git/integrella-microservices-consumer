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
 * Identifies the market sector in which the trade has been arranged.
 * 
 * <p>Java class for BrokerConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokerConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brokerConfirmationType" type="{http://www.fpml.org/FpML-5/master}BrokerConfirmationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerConfirmation", propOrder = {
    "brokerConfirmationType"
})
public class BrokerConfirmation {

    protected BrokerConfirmationType brokerConfirmationType;

    /**
     * Gets the value of the brokerConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public BrokerConfirmationType getBrokerConfirmationType() {
        return brokerConfirmationType;
    }

    /**
     * Sets the value of the brokerConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public void setBrokerConfirmationType(BrokerConfirmationType value) {
        this.brokerConfirmationType = value;
    }

}
