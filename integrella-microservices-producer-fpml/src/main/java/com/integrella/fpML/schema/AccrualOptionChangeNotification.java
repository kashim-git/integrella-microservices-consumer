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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A loan servicing notification used to update an accrual option within a single facility. Embedded business events simply re-state the given accrual option.
 * 
 * <p>Java class for AccrualOptionChangeNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccrualOptionChangeNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}AbstractContractNotification">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;element name="fixedRateOptionChange" type="{http://www.fpml.org/FpML-5/master}FixedRateOptionChange"/>
 *               &lt;element name="floatingRateOptionChange" type="{http://www.fpml.org/FpML-5/master}FloatingRateOptionChange"/>
 *             &lt;/choice>
 *             &lt;element name="contract" type="{http://www.fpml.org/FpML-5/master}LoanContract" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="accruingPikOptionChange" type="{http://www.fpml.org/FpML-5/master}AccruingPikOptionChange"/>
 *           &lt;sequence>
 *             &lt;element name="lcOptionChange" type="{http://www.fpml.org/FpML-5/master}LcOptionChange" minOccurs="0"/>
 *             &lt;element name="letterOfCredit" type="{http://www.fpml.org/FpML-5/master}LetterOfCredit" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityDetails.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}LoanContractDetails.model" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}LetterOfCreditDetails.model" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AccrualOptionChangeNotification", propOrder = {
    "fixedRateOptionChange",
    "floatingRateOptionChange",
    "contract",
    "accruingPikOptionChange",
    "lcOptionChange",
    "letterOfCredit",
    "facilityIdentifier",
    "facilitySummary",
    "loanContractDetailsModel",
    "letterOfCreditDetailsModel",
    "party"
})
public class AccrualOptionChangeNotification
    extends AbstractContractNotification
{

    protected FixedRateOptionChange fixedRateOptionChange;
    protected FloatingRateOptionChange floatingRateOptionChange;
    protected List<LoanContract> contract;
    protected AccruingPikOptionChange accruingPikOptionChange;
    protected LcOptionChange lcOptionChange;
    protected List<LetterOfCredit> letterOfCredit;
    protected FacilityIdentifier facilityIdentifier;
    protected FacilitySummary facilitySummary;
    @XmlElements({
        @XmlElement(name = "contractIdentifier", type = FacilityContractIdentifier.class),
        @XmlElement(name = "contractSummary", type = LoanContractSummary.class),
        @XmlElement(name = "contract", type = LoanContract.class)
    })
    protected List<Object> loanContractDetailsModel;
    @XmlElements({
        @XmlElement(name = "letterOfCreditIdentifier", type = FacilityContractIdentifier.class),
        @XmlElement(name = "letterOfCreditSummary", type = LetterOfCreditSummary.class),
        @XmlElement(name = "letterOfCredit", type = LetterOfCredit.class)
    })
    protected List<Object> letterOfCreditDetailsModel;
    protected List<Party> party;

    /**
     * Gets the value of the fixedRateOptionChange property.
     * 
     * @return
     *     possible object is
     *     {@link FixedRateOptionChange }
     *     
     */
    public FixedRateOptionChange getFixedRateOptionChange() {
        return fixedRateOptionChange;
    }

    /**
     * Sets the value of the fixedRateOptionChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedRateOptionChange }
     *     
     */
    public void setFixedRateOptionChange(FixedRateOptionChange value) {
        this.fixedRateOptionChange = value;
    }

    /**
     * Gets the value of the floatingRateOptionChange property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateOptionChange }
     *     
     */
    public FloatingRateOptionChange getFloatingRateOptionChange() {
        return floatingRateOptionChange;
    }

    /**
     * Sets the value of the floatingRateOptionChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateOptionChange }
     *     
     */
    public void setFloatingRateOptionChange(FloatingRateOptionChange value) {
        this.floatingRateOptionChange = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanContract }
     * 
     * 
     */
    public List<LoanContract> getContract() {
        if (contract == null) {
            contract = new ArrayList<LoanContract>();
        }
        return this.contract;
    }

    /**
     * Gets the value of the accruingPikOptionChange property.
     * 
     * @return
     *     possible object is
     *     {@link AccruingPikOptionChange }
     *     
     */
    public AccruingPikOptionChange getAccruingPikOptionChange() {
        return accruingPikOptionChange;
    }

    /**
     * Sets the value of the accruingPikOptionChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruingPikOptionChange }
     *     
     */
    public void setAccruingPikOptionChange(AccruingPikOptionChange value) {
        this.accruingPikOptionChange = value;
    }

    /**
     * Gets the value of the lcOptionChange property.
     * 
     * @return
     *     possible object is
     *     {@link LcOptionChange }
     *     
     */
    public LcOptionChange getLcOptionChange() {
        return lcOptionChange;
    }

    /**
     * Sets the value of the lcOptionChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcOptionChange }
     *     
     */
    public void setLcOptionChange(LcOptionChange value) {
        this.lcOptionChange = value;
    }

    /**
     * Gets the value of the letterOfCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterOfCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterOfCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetterOfCredit }
     * 
     * 
     */
    public List<LetterOfCredit> getLetterOfCredit() {
        if (letterOfCredit == null) {
            letterOfCredit = new ArrayList<LetterOfCredit>();
        }
        return this.letterOfCredit;
    }

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityIdentifier }
     *     
     */
    public FacilityIdentifier getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityIdentifier }
     *     
     */
    public void setFacilityIdentifier(FacilityIdentifier value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the facilitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link FacilitySummary }
     *     
     */
    public FacilitySummary getFacilitySummary() {
        return facilitySummary;
    }

    /**
     * Sets the value of the facilitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilitySummary }
     *     
     */
    public void setFacilitySummary(FacilitySummary value) {
        this.facilitySummary = value;
    }

    /**
     * Gets the value of the loanContractDetailsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanContractDetailsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanContractDetailsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityContractIdentifier }
     * {@link LoanContractSummary }
     * {@link LoanContract }
     * 
     * 
     */
    public List<Object> getLoanContractDetailsModel() {
        if (loanContractDetailsModel == null) {
            loanContractDetailsModel = new ArrayList<Object>();
        }
        return this.loanContractDetailsModel;
    }

    /**
     * Gets the value of the letterOfCreditDetailsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterOfCreditDetailsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterOfCreditDetailsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityContractIdentifier }
     * {@link LetterOfCreditSummary }
     * {@link LetterOfCredit }
     * 
     * 
     */
    public List<Object> getLetterOfCreditDetailsModel() {
        if (letterOfCreditDetailsModel == null) {
            letterOfCreditDetailsModel = new ArrayList<Object>();
        }
        return this.letterOfCreditDetailsModel;
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
