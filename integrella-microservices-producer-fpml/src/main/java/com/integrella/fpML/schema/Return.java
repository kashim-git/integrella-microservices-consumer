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
 * A type describing the dividend return conditions applicable to the swap.
 * 
 * <p>Java class for Return complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnType" type="{http://www.fpml.org/FpML-5/master}ReturnTypeEnum" minOccurs="0"/>
 *         &lt;element name="dividendConditions" type="{http://www.fpml.org/FpML-5/master}DividendConditions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return", propOrder = {
    "returnType",
    "dividendConditions"
})
public class Return {

    protected ReturnTypeEnum returnType;
    protected DividendConditions dividendConditions;

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTypeEnum }
     *     
     */
    public ReturnTypeEnum getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTypeEnum }
     *     
     */
    public void setReturnType(ReturnTypeEnum value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the dividendConditions property.
     * 
     * @return
     *     possible object is
     *     {@link DividendConditions }
     *     
     */
    public DividendConditions getDividendConditions() {
        return dividendConditions;
    }

    /**
     * Sets the value of the dividendConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendConditions }
     *     
     */
    public void setDividendConditions(DividendConditions value) {
        this.dividendConditions = value;
    }

}