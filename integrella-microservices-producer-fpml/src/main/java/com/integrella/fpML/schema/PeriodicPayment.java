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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PeriodicPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}PaymentBase">
 *       &lt;sequence>
 *         &lt;element name="paymentFrequency" type="{http://www.fpml.org/FpML-5/master}Period" minOccurs="0"/>
 *         &lt;element name="firstPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="firstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastRegularPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rollConvention" type="{http://www.fpml.org/FpML-5/master}RollConventionEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fixedAmount" type="{http://www.fpml.org/FpML-5/master}Money"/>
 *           &lt;element name="fixedAmountCalculation" type="{http://www.fpml.org/FpML-5/master}FixedAmountCalculation"/>
 *           &lt;element name="floatingAmountCalculation" type="{http://www.fpml.org/FpML-5/master}FloatingAmountCalculation"/>
 *         &lt;/choice>
 *         &lt;element name="adjustedPaymentDates" type="{http://www.fpml.org/FpML-5/master}AdjustedPaymentDates" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicPayment", propOrder = {
    "paymentFrequency",
    "firstPeriodStartDate",
    "firstPaymentDate",
    "lastRegularPaymentDate",
    "rollConvention",
    "fixedAmount",
    "fixedAmountCalculation",
    "floatingAmountCalculation",
    "adjustedPaymentDates"
})
public class PeriodicPayment
    extends PaymentBase
{

    protected Period paymentFrequency;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPeriodStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPaymentDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastRegularPaymentDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rollConvention;
    protected Money fixedAmount;
    protected FixedAmountCalculation fixedAmountCalculation;
    protected FloatingAmountCalculation floatingAmountCalculation;
    protected List<AdjustedPaymentDates> adjustedPaymentDates;

    /**
     * Gets the value of the paymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPaymentFrequency(Period value) {
        this.paymentFrequency = value;
    }

    /**
     * Gets the value of the firstPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPeriodStartDate() {
        return firstPeriodStartDate;
    }

    /**
     * Sets the value of the firstPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPeriodStartDate(XMLGregorianCalendar value) {
        this.firstPeriodStartDate = value;
    }

    /**
     * Gets the value of the firstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPaymentDate() {
        return firstPaymentDate;
    }

    /**
     * Sets the value of the firstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPaymentDate(XMLGregorianCalendar value) {
        this.firstPaymentDate = value;
    }

    /**
     * Gets the value of the lastRegularPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRegularPaymentDate() {
        return lastRegularPaymentDate;
    }

    /**
     * Sets the value of the lastRegularPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRegularPaymentDate(XMLGregorianCalendar value) {
        this.lastRegularPaymentDate = value;
    }

    /**
     * Gets the value of the rollConvention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollConvention() {
        return rollConvention;
    }

    /**
     * Sets the value of the rollConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollConvention(String value) {
        this.rollConvention = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFixedAmount(Money value) {
        this.fixedAmount = value;
    }

    /**
     * Gets the value of the fixedAmountCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FixedAmountCalculation }
     *     
     */
    public FixedAmountCalculation getFixedAmountCalculation() {
        return fixedAmountCalculation;
    }

    /**
     * Sets the value of the fixedAmountCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedAmountCalculation }
     *     
     */
    public void setFixedAmountCalculation(FixedAmountCalculation value) {
        this.fixedAmountCalculation = value;
    }

    /**
     * Gets the value of the floatingAmountCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingAmountCalculation }
     *     
     */
    public FloatingAmountCalculation getFloatingAmountCalculation() {
        return floatingAmountCalculation;
    }

    /**
     * Sets the value of the floatingAmountCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingAmountCalculation }
     *     
     */
    public void setFloatingAmountCalculation(FloatingAmountCalculation value) {
        this.floatingAmountCalculation = value;
    }

    /**
     * Gets the value of the adjustedPaymentDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustedPaymentDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustedPaymentDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustedPaymentDates }
     * 
     * 
     */
    public List<AdjustedPaymentDates> getAdjustedPaymentDates() {
        if (adjustedPaymentDates == null) {
            adjustedPaymentDates = new ArrayList<AdjustedPaymentDates>();
        }
        return this.adjustedPaymentDates;
    }

}
