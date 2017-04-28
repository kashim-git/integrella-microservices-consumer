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
 * <p>Java class for InterestLegResetDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestLegResetDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationPeriodDatesReference" type="{http://www.fpml.org/FpML-5/master}InterestLegCalculationPeriodDatesReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="resetRelativeTo" type="{http://www.fpml.org/FpML-5/master}ResetRelativeToEnum"/>
 *           &lt;element name="resetFrequency" type="{http://www.fpml.org/FpML-5/master}ResetFrequency"/>
 *         &lt;/choice>
 *         &lt;element name="initialFixingDate" type="{http://www.fpml.org/FpML-5/master}RelativeDateOffset" minOccurs="0"/>
 *         &lt;element name="fixingDates" type="{http://www.fpml.org/FpML-5/master}AdjustableDatesOrRelativeDateOffset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestLegResetDates", propOrder = {
    "calculationPeriodDatesReference",
    "resetRelativeTo",
    "resetFrequency",
    "initialFixingDate",
    "fixingDates"
})
public class InterestLegResetDates {

    protected InterestLegCalculationPeriodDatesReference calculationPeriodDatesReference;
    protected ResetRelativeToEnum resetRelativeTo;
    protected ResetFrequency resetFrequency;
    protected RelativeDateOffset initialFixingDate;
    protected AdjustableDatesOrRelativeDateOffset fixingDates;

    /**
     * Gets the value of the calculationPeriodDatesReference property.
     * 
     * @return
     *     possible object is
     *     {@link InterestLegCalculationPeriodDatesReference }
     *     
     */
    public InterestLegCalculationPeriodDatesReference getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    /**
     * Sets the value of the calculationPeriodDatesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestLegCalculationPeriodDatesReference }
     *     
     */
    public void setCalculationPeriodDatesReference(InterestLegCalculationPeriodDatesReference value) {
        this.calculationPeriodDatesReference = value;
    }

    /**
     * Gets the value of the resetRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link ResetRelativeToEnum }
     *     
     */
    public ResetRelativeToEnum getResetRelativeTo() {
        return resetRelativeTo;
    }

    /**
     * Sets the value of the resetRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetRelativeToEnum }
     *     
     */
    public void setResetRelativeTo(ResetRelativeToEnum value) {
        this.resetRelativeTo = value;
    }

    /**
     * Gets the value of the resetFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ResetFrequency }
     *     
     */
    public ResetFrequency getResetFrequency() {
        return resetFrequency;
    }

    /**
     * Sets the value of the resetFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetFrequency }
     *     
     */
    public void setResetFrequency(ResetFrequency value) {
        this.resetFrequency = value;
    }

    /**
     * Gets the value of the initialFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getInitialFixingDate() {
        return initialFixingDate;
    }

    /**
     * Sets the value of the initialFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setInitialFixingDate(RelativeDateOffset value) {
        this.initialFixingDate = value;
    }

    /**
     * Gets the value of the fixingDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public AdjustableDatesOrRelativeDateOffset getFixingDates() {
        return fixingDates;
    }

    /**
     * Sets the value of the fixingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public void setFixingDates(AdjustableDatesOrRelativeDateOffset value) {
        this.fixingDates = value;
    }

}
