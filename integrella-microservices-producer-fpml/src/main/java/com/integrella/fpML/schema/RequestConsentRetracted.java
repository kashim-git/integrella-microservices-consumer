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
import javax.xml.bind.annotation.XmlType;


/**
 * A message withdrawing a request that the sender be authorized by the recipient to peform an action.
 * 
 * <p>Java class for RequestConsentRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestConsentRetracted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NonCorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/master}ApprovalType" minOccurs="0"/>
 *         &lt;element name="approver" type="{http://www.fpml.org/FpML-5/master}PersonId" minOccurs="0"/>
 *         &lt;element name="approvingPartyReference" type="{http://www.fpml.org/FpML-5/master}PartyReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}TradingAndPostTradeEvents.model"/>
 *           &lt;element name="deClear" type="{http://www.fpml.org/FpML-5/master}DeClear"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartiesAndAccounts.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestConsentRetracted", propOrder = {
    "type",
    "approver",
    "approvingPartyReference",
    "tradePackage",
    "originatingEvent",
    "trade",
    "tradingEvent",
    "amendment",
    "increase",
    "terminatingEvent",
    "termination",
    "novation",
    "withdrawal",
    "additionalEvent",
    "deClear",
    "party",
    "account"
})
public class RequestConsentRetracted
    extends NonCorrectableRequestMessage
{

    protected ApprovalType type;
    protected PersonId approver;
    protected PartyReference approvingPartyReference;
    protected TradePackage tradePackage;
    protected OriginatingEvent originatingEvent;
    protected Trade trade;
    protected List<TradingEventSummary> tradingEvent;
    protected TradeAmendmentContent amendment;
    protected TradeNotionalChange increase;
    protected TerminatingEvent terminatingEvent;
    protected TradeNotionalChange termination;
    protected TradeNovationContent novation;
    protected Withdrawal withdrawal;
    protected AdditionalEvent additionalEvent;
    protected DeClear deClear;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalType }
     *     
     */
    public ApprovalType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalType }
     *     
     */
    public void setType(ApprovalType value) {
        this.type = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setApprover(PersonId value) {
        this.approver = value;
    }

    /**
     * Gets the value of the approvingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getApprovingPartyReference() {
        return approvingPartyReference;
    }

    /**
     * Sets the value of the approvingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setApprovingPartyReference(PartyReference value) {
        this.approvingPartyReference = value;
    }

    /**
     * Gets the value of the tradePackage property.
     * 
     * @return
     *     possible object is
     *     {@link TradePackage }
     *     
     */
    public TradePackage getTradePackage() {
        return tradePackage;
    }

    /**
     * Sets the value of the tradePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePackage }
     *     
     */
    public void setTradePackage(TradePackage value) {
        this.tradePackage = value;
    }

    /**
     * Gets the value of the originatingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingEvent }
     *     
     */
    public OriginatingEvent getOriginatingEvent() {
        return originatingEvent;
    }

    /**
     * Sets the value of the originatingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingEvent }
     *     
     */
    public void setOriginatingEvent(OriginatingEvent value) {
        this.originatingEvent = value;
    }

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
     * Gets the value of the tradingEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingEventSummary }
     * 
     * 
     */
    public List<TradingEventSummary> getTradingEvent() {
        if (tradingEvent == null) {
            tradingEvent = new ArrayList<TradingEventSummary>();
        }
        return this.tradingEvent;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAmendmentContent }
     *     
     */
    public TradeAmendmentContent getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAmendmentContent }
     *     
     */
    public void setAmendment(TradeAmendmentContent value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the increase property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNotionalChange }
     *     
     */
    public TradeNotionalChange getIncrease() {
        return increase;
    }

    /**
     * Sets the value of the increase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNotionalChange }
     *     
     */
    public void setIncrease(TradeNotionalChange value) {
        this.increase = value;
    }

    /**
     * Gets the value of the terminatingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TerminatingEvent }
     *     
     */
    public TerminatingEvent getTerminatingEvent() {
        return terminatingEvent;
    }

    /**
     * Sets the value of the terminatingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminatingEvent }
     *     
     */
    public void setTerminatingEvent(TerminatingEvent value) {
        this.terminatingEvent = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNotionalChange }
     *     
     */
    public TradeNotionalChange getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNotionalChange }
     *     
     */
    public void setTermination(TradeNotionalChange value) {
        this.termination = value;
    }

    /**
     * Gets the value of the novation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNovationContent }
     *     
     */
    public TradeNovationContent getNovation() {
        return novation;
    }

    /**
     * Sets the value of the novation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNovationContent }
     *     
     */
    public void setNovation(TradeNovationContent value) {
        this.novation = value;
    }

    /**
     * Gets the value of the withdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link Withdrawal }
     *     
     */
    public Withdrawal getWithdrawal() {
        return withdrawal;
    }

    /**
     * Sets the value of the withdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Withdrawal }
     *     
     */
    public void setWithdrawal(Withdrawal value) {
        this.withdrawal = value;
    }

    /**
     * Gets the value of the additionalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalEvent }
     *     
     */
    public AdditionalEvent getAdditionalEvent() {
        return additionalEvent;
    }

    /**
     * Sets the value of the additionalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalEvent }
     *     
     */
    public void setAdditionalEvent(AdditionalEvent value) {
        this.additionalEvent = value;
    }

    /**
     * Gets the value of the deClear property.
     * 
     * @return
     *     possible object is
     *     {@link DeClear }
     *     
     */
    public DeClear getDeClear() {
        return deClear;
    }

    /**
     * Sets the value of the deClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeClear }
     *     
     */
    public void setDeClear(DeClear value) {
        this.deClear = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
