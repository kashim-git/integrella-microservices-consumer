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
 * <p>Java class for AllegedCashflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllegedCashflow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}DefinitionAndCashflows.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllegedCashflow", propOrder = {
    "asOfDate",
    "reportContents",
    "tradeCashflowsId",
    "tradeIdentifyingItems",
    "adjustedPaymentDate",
    "payment"
})
public class AllegedCashflow {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfDate;
    protected ReportContents reportContents;
    protected TradeCashflowsId tradeCashflowsId;
    protected TradeIdentifyingItems tradeIdentifyingItems;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedPaymentDate;
    protected List<PaymentMatching> payment;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the reportContents property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContents }
     *     
     */
    public ReportContents getReportContents() {
        return reportContents;
    }

    /**
     * Sets the value of the reportContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContents }
     *     
     */
    public void setReportContents(ReportContents value) {
        this.reportContents = value;
    }

    /**
     * Gets the value of the tradeCashflowsId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCashflowsId }
     *     
     */
    public TradeCashflowsId getTradeCashflowsId() {
        return tradeCashflowsId;
    }

    /**
     * Sets the value of the tradeCashflowsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCashflowsId }
     *     
     */
    public void setTradeCashflowsId(TradeCashflowsId value) {
        this.tradeCashflowsId = value;
    }

    /**
     * Gets the value of the tradeIdentifyingItems property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifyingItems }
     *     
     */
    public TradeIdentifyingItems getTradeIdentifyingItems() {
        return tradeIdentifyingItems;
    }

    /**
     * Sets the value of the tradeIdentifyingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifyingItems }
     *     
     */
    public void setTradeIdentifyingItems(TradeIdentifyingItems value) {
        this.tradeIdentifyingItems = value;
    }

    /**
     * Gets the value of the adjustedPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedPaymentDate() {
        return adjustedPaymentDate;
    }

    /**
     * Sets the value of the adjustedPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedPaymentDate(XMLGregorianCalendar value) {
        this.adjustedPaymentDate = value;
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
     * {@link PaymentMatching }
     * 
     * 
     */
    public List<PaymentMatching> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentMatching>();
        }
        return this.payment;
    }

}
