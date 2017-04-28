//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the basic content for a message sent to inform another system that some 'business event' has occured. Notifications are not expected to be replied to.
 * 
 * <p>Java class for NotificationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Message">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://www.fpml.org/FpML-5/master}NotificationMessageHeader" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}Validation.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CorrelationAndOptionalSequence.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}OnBehalfOf.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessage", propOrder = {
    "header",
    "validation",
    "parentCorrelationId",
    "correlationId",
    "sequenceNumber",
    "onBehalfOf"
})
@XmlSeeAlso({
    ResetReport.class,
    OrderStatusNotification.class,
    ValuationReport.class,
    DisputeNotification.class,
    CreditLimitResponse.class,
    CancelTradeCashflows.class,
    ValuationReportRetracted.class,
    PositionReport.class,
    ExposureReport.class,
    ClearingRefused.class,
    MarginQuoteRefused.class,
    PositionActivityReport.class,
    ClearingStatus.class,
    ServiceNotification.class,
    EventActivityReport.class,
    ClearingConfirmed.class,
    LimitCheckRefused.class,
    PartyReport.class,
    TradeCashflowsAsserted.class,
    InterestStatement.class,
    CreditLimitReport.class,
    CollateralAllocationReport.class,
    TerminatingEventsReport.class,
    ApprovalStatusNotification.class,
    LimitCheckApproved.class
})
public abstract class NotificationMessage
    extends Message
{

    protected NotificationMessageHeader header;
    protected List<Validation> validation;
    protected CorrelationId parentCorrelationId;
    protected CorrelationId correlationId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    protected List<OnBehalfOf> onBehalfOf;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationMessageHeader }
     *     
     */
    public NotificationMessageHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationMessageHeader }
     *     
     */
    public void setHeader(NotificationMessageHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validation }
     * 
     * 
     */
    public List<Validation> getValidation() {
        if (validation == null) {
            validation = new ArrayList<Validation>();
        }
        return this.validation;
    }

    /**
     * Gets the value of the parentCorrelationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getParentCorrelationId() {
        return parentCorrelationId;
    }

    /**
     * Sets the value of the parentCorrelationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setParentCorrelationId(CorrelationId value) {
        this.parentCorrelationId = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setCorrelationId(CorrelationId value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the onBehalfOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onBehalfOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnBehalfOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnBehalfOf }
     * 
     * 
     */
    public List<OnBehalfOf> getOnBehalfOf() {
        if (onBehalfOf == null) {
            onBehalfOf = new ArrayList<OnBehalfOf>();
        }
        return this.onBehalfOf;
    }

}
