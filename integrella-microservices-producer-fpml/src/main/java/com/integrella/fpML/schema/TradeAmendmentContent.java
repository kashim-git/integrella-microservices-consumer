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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing a negotiated amendment.
 * 
 * <p>Java class for TradeAmendmentContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeAmendmentContent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}AbstractEvent">
 *       &lt;sequence>
 *         &lt;element name="trade" type="{http://www.fpml.org/FpML-5/master}Trade" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}AgreementAndEffectiveDates.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}ReportingNotionalChange.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}TradeAlterationPayment.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAmendmentContent", propOrder = {
    "trade",
    "agreementDate",
    "executionDateTime",
    "effectiveDate",
    "notionalChange",
    "changeInNotional",
    "changeInNumberOfOptions",
    "changeInQuantity",
    "payment"
})
public class TradeAmendmentContent
    extends AbstractEvent
{

    protected Trade trade;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    protected ExecutionDateTime executionDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    protected NotionalChangeEnum notionalChange;
    protected List<MoneyRef> changeInNotional;
    protected List<AmountRef> changeInNumberOfOptions;
    protected List<UnitQuantityRef> changeInQuantity;
    protected List<Payment> payment;

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the executionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionDateTime }
     *     
     */
    public ExecutionDateTime getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * Sets the value of the executionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionDateTime }
     *     
     */
    public void setExecutionDateTime(ExecutionDateTime value) {
        this.executionDateTime = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the notionalChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalChangeEnum }
     *     
     */
    public NotionalChangeEnum getNotionalChange() {
        return notionalChange;
    }

    /**
     * Sets the value of the notionalChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalChangeEnum }
     *     
     */
    public void setNotionalChange(NotionalChangeEnum value) {
        this.notionalChange = value;
    }

    /**
     * Gets the value of the changeInNotional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInNotional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInNotional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyRef }
     * 
     * 
     */
    public List<MoneyRef> getChangeInNotional() {
        if (changeInNotional == null) {
            changeInNotional = new ArrayList<MoneyRef>();
        }
        return this.changeInNotional;
    }

    /**
     * Gets the value of the changeInNumberOfOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInNumberOfOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInNumberOfOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRef }
     * 
     * 
     */
    public List<AmountRef> getChangeInNumberOfOptions() {
        if (changeInNumberOfOptions == null) {
            changeInNumberOfOptions = new ArrayList<AmountRef>();
        }
        return this.changeInNumberOfOptions;
    }

    /**
     * Gets the value of the changeInQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitQuantityRef }
     * 
     * 
     */
    public List<UnitQuantityRef> getChangeInQuantity() {
        if (changeInQuantity == null) {
            changeInQuantity = new ArrayList<UnitQuantityRef>();
        }
        return this.changeInQuantity;
    }

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

}
