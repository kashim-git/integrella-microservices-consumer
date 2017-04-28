//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Specifies the calculation method of the interest rate leg of the return swap. Includes the floating or fixed rate calculation definitions, along with the determination of the day count fraction.
 * 
 * <p>Java class for InterestCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestCalculation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}InterestAccrualsMethod">
 *       &lt;sequence>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/master}DayCountFraction" minOccurs="0"/>
 *         &lt;element name="compounding" type="{http://www.fpml.org/FpML-5/master}Compounding" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="interpolationMethod" type="{http://www.fpml.org/FpML-5/master}InterpolationMethod" minOccurs="0"/>
 *           &lt;element name="interpolationPeriod" type="{http://www.fpml.org/FpML-5/master}InterpolationPeriodEnum" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCalculation", propOrder = {
    "dayCountFraction",
    "compounding",
    "interpolationMethod",
    "interpolationPeriod"
})
public class InterestCalculation
    extends InterestAccrualsMethod
{

    protected DayCountFraction dayCountFraction;
    protected Compounding compounding;
    protected InterpolationMethod interpolationMethod;
    protected InterpolationPeriodEnum interpolationPeriod;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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

    /**
     * Gets the value of the compounding property.
     * 
     * @return
     *     possible object is
     *     {@link Compounding }
     *     
     */
    public Compounding getCompounding() {
        return compounding;
    }

    /**
     * Sets the value of the compounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compounding }
     *     
     */
    public void setCompounding(Compounding value) {
        this.compounding = value;
    }

    /**
     * Gets the value of the interpolationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InterpolationMethod }
     *     
     */
    public InterpolationMethod getInterpolationMethod() {
        return interpolationMethod;
    }

    /**
     * Sets the value of the interpolationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationMethod }
     *     
     */
    public void setInterpolationMethod(InterpolationMethod value) {
        this.interpolationMethod = value;
    }

    /**
     * Gets the value of the interpolationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link InterpolationPeriodEnum }
     *     
     */
    public InterpolationPeriodEnum getInterpolationPeriod() {
        return interpolationPeriod;
    }

    /**
     * Sets the value of the interpolationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationPeriodEnum }
     *     
     */
    public void setInterpolationPeriod(InterpolationPeriodEnum value) {
        this.interpolationPeriod = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
