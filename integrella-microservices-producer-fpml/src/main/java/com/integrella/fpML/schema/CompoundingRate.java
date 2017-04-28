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
 * A type defining a compounding rate. The compounding interest can either point back to the floating rate calculation of interest calculation node on the Interest Leg, or be defined specifically.
 * 
 * <p>Java class for CompoundingRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundingRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="interestLegRate" type="{http://www.fpml.org/FpML-5/master}FloatingRateCalculationReference"/>
 *         &lt;element name="specificRate" type="{http://www.fpml.org/FpML-5/master}InterestAccrualsMethod"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundingRate", propOrder = {
    "interestLegRate",
    "specificRate"
})
public class CompoundingRate {

    protected FloatingRateCalculationReference interestLegRate;
    protected InterestAccrualsMethod specificRate;

    /**
     * Gets the value of the interestLegRate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateCalculationReference }
     *     
     */
    public FloatingRateCalculationReference getInterestLegRate() {
        return interestLegRate;
    }

    /**
     * Sets the value of the interestLegRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateCalculationReference }
     *     
     */
    public void setInterestLegRate(FloatingRateCalculationReference value) {
        this.interestLegRate = value;
    }

    /**
     * Gets the value of the specificRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAccrualsMethod }
     *     
     */
    public InterestAccrualsMethod getSpecificRate() {
        return specificRate;
    }

    /**
     * Sets the value of the specificRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAccrualsMethod }
     *     
     */
    public void setSpecificRate(InterestAccrualsMethod value) {
        this.specificRate = value;
    }

}
