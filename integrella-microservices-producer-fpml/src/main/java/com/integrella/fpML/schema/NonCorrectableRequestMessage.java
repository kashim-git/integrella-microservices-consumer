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
 * A type defining the content model for a request message that cannot be subsequently corrected or retracted.
 * 
 * <p>Java class for NonCorrectableRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonCorrectableRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}RequestMessage">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CorrelationAndSequence.model" minOccurs="0"/>
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
@XmlType(name = "NonCorrectableRequestMessage", propOrder = {
    "parentCorrelationId",
    "correlationId",
    "sequenceNumber",
    "onBehalfOf"
})
@XmlSeeAlso({
    VerificationStatusNotification.class,
    RequestSubstitutionRetracted.class,
    ConfirmationRetracted.class,
    DisputeRetracted.class,
    RestoreCredit.class,
    NettedTradeCashflowsRetracted.class,
    SuspendCredit.class,
    AccruingFeePaymentNotificationRetracted.class,
    RequestExecutionRetracted.class,
    ExecutionAdviceRetracted.class,
    SubstitutionStatusRetracted.class,
    RequestTradeReferenceInformationUpdateRetracted.class,
    PublicExecutionReportRetracted.class,
    TradeChangeAdviceRetracted.class,
    AccruingFeeChangeNotificationRetracted.class,
    RequestInterestRetracted.class,
    CreditEventNotificationRetracted.class,
    NonpublicExecutionReportRetracted.class,
    NonRecurringFeePaymentNotificationRetracted.class,
    RequestRetransmission.class,
    MarginCallStatusRetracted.class,
    ExecutionRetracted.class,
    InterestStatusRetracted.class,
    RequestMarginRetracted.class,
    RolloverNotificationRetracted.class,
    FacilityNotificationRetracted.class,
    RequestConsentRetracted.class,
    RequestEventStatus.class,
    FacilityRateChangeNotificationRetracted.class,
    AccrualOptionChangeNotificationRetracted.class,
    LcNotificationRetracted.class,
    SetCreditLimit.class,
    RequestAllocationRetracted.class,
    AccruingPikPaymentNotificationRetracted.class,
    RequestClearingRetracted.class,
    LoanContractNotificationRetracted.class,
    PrepaymentNotificationRetracted.class
})
public class NonCorrectableRequestMessage
    extends RequestMessage
{

    protected CorrelationId parentCorrelationId;
    protected CorrelationId correlationId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    protected List<OnBehalfOf> onBehalfOf;

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
