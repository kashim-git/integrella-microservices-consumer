//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestCalculationTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestCalculationTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationType" type="{http://www.fpml.org/FpML-5/master}InterestCalculationTypeEnum" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.fpml.org/FpML-5/master}FloatingRateIndex" minOccurs="0"/>
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/master}DayCountFraction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCalculationTerms", propOrder = {
    "calculationType",
    "index",
    "spread",
    "dayCountFraction"
})
public class InterestCalculationTerms {

    protected InterestCalculationTypeEnum calculationType;
    protected FloatingRateIndex index;
    protected BigDecimal spread;
    protected DayCountFraction dayCountFraction;

    /**
     * Gets the value of the calculationType property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCalculationTypeEnum }
     *     
     */
    public InterestCalculationTypeEnum getCalculationType() {
        return calculationType;
    }

    /**
     * Sets the value of the calculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCalculationTypeEnum }
     *     
     */
    public void setCalculationType(InterestCalculationTypeEnum value) {
        this.calculationType = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setIndex(FloatingRateIndex value) {
        this.index = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

}