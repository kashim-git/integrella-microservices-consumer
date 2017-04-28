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
 * Message for sending match results. Response message that returns the status of the set of cashflows for multiple trades that have been reconciled.
 * 
 * <p>Java class for NettedTradeCashflowsMatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NettedTradeCashflowsMatchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.fpml.org/FpML-5/master}TradeCashflowsStatus" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="assertedCashflow" type="{http://www.fpml.org/FpML-5/master}AssertedNettedCashflow" minOccurs="0"/>
 *             &lt;element name="proposedMatch" type="{http://www.fpml.org/FpML-5/master}NettedTradeCashflowsProposedMatch" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="allegedCashflow" type="{http://www.fpml.org/FpML-5/master}AllegedNettedCashflow"/>
 *         &lt;/choice>
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/master}Party" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettedTradeCashflowsMatchResult", propOrder = {
    "status",
    "assertedCashflow",
    "proposedMatch",
    "allegedCashflow",
    "party"
})
public class NettedTradeCashflowsMatchResult
    extends ResponseMessage
{

    protected TradeCashflowsStatus status;
    protected AssertedNettedCashflow assertedCashflow;
    protected List<NettedTradeCashflowsProposedMatch> proposedMatch;
    protected AllegedNettedCashflow allegedCashflow;
    protected List<Party> party;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCashflowsStatus }
     *     
     */
    public TradeCashflowsStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCashflowsStatus }
     *     
     */
    public void setStatus(TradeCashflowsStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the assertedCashflow property.
     * 
     * @return
     *     possible object is
     *     {@link AssertedNettedCashflow }
     *     
     */
    public AssertedNettedCashflow getAssertedCashflow() {
        return assertedCashflow;
    }

    /**
     * Sets the value of the assertedCashflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertedNettedCashflow }
     *     
     */
    public void setAssertedCashflow(AssertedNettedCashflow value) {
        this.assertedCashflow = value;
    }

    /**
     * Gets the value of the proposedMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposedMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposedMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NettedTradeCashflowsProposedMatch }
     * 
     * 
     */
    public List<NettedTradeCashflowsProposedMatch> getProposedMatch() {
        if (proposedMatch == null) {
            proposedMatch = new ArrayList<NettedTradeCashflowsProposedMatch>();
        }
        return this.proposedMatch;
    }

    /**
     * Gets the value of the allegedCashflow property.
     * 
     * @return
     *     possible object is
     *     {@link AllegedNettedCashflow }
     *     
     */
    public AllegedNettedCashflow getAllegedCashflow() {
        return allegedCashflow;
    }

    /**
     * Sets the value of the allegedCashflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllegedNettedCashflow }
     *     
     */
    public void setAllegedCashflow(AllegedNettedCashflow value) {
        this.allegedCashflow = value;
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

}
