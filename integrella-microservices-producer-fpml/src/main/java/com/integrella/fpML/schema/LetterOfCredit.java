//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A definition of an unfunded borrowing (guarantee) instrument known as a Letter of Credit.
 * 
 * <p>Java class for LetterOfCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCredit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LetterOfCreditSummary">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="finalExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="lcAccrual" type="{http://www.fpml.org/FpML-5/master}LcAccrual" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.fpml.org/FpML-5/master}LcPurpose" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}LetterOfCreditFeatures.model"/>
 *         &lt;element name="facilityFxRate" type="{http://www.fpml.org/FpML-5/master}FxTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfCredit", propOrder = {
    "expiryDate",
    "finalExpiryDate",
    "lcAccrual",
    "purpose",
    "evergreenOption",
    "lcAutoAdjust",
    "minLcIssuanceFeeAmount",
    "facilityFxRate"
})
public class LetterOfCredit
    extends LetterOfCreditSummary
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalExpiryDate;
    protected LcAccrual lcAccrual;
    protected LcPurpose purpose;
    protected EvergreenOption evergreenOption;
    protected LcAutoAdjustEnum lcAutoAdjust;
    protected MoneyWithParticipantShare minLcIssuanceFeeAmount;
    protected FxTerms facilityFxRate;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the finalExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalExpiryDate() {
        return finalExpiryDate;
    }

    /**
     * Sets the value of the finalExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalExpiryDate(XMLGregorianCalendar value) {
        this.finalExpiryDate = value;
    }

    /**
     * Gets the value of the lcAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link LcAccrual }
     *     
     */
    public LcAccrual getLcAccrual() {
        return lcAccrual;
    }

    /**
     * Sets the value of the lcAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcAccrual }
     *     
     */
    public void setLcAccrual(LcAccrual value) {
        this.lcAccrual = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link LcPurpose }
     *     
     */
    public LcPurpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcPurpose }
     *     
     */
    public void setPurpose(LcPurpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the evergreenOption property.
     * 
     * @return
     *     possible object is
     *     {@link EvergreenOption }
     *     
     */
    public EvergreenOption getEvergreenOption() {
        return evergreenOption;
    }

    /**
     * Sets the value of the evergreenOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvergreenOption }
     *     
     */
    public void setEvergreenOption(EvergreenOption value) {
        this.evergreenOption = value;
    }

    /**
     * Gets the value of the lcAutoAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link LcAutoAdjustEnum }
     *     
     */
    public LcAutoAdjustEnum getLcAutoAdjust() {
        return lcAutoAdjust;
    }

    /**
     * Sets the value of the lcAutoAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcAutoAdjustEnum }
     *     
     */
    public void setLcAutoAdjust(LcAutoAdjustEnum value) {
        this.lcAutoAdjust = value;
    }

    /**
     * Gets the value of the minLcIssuanceFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getMinLcIssuanceFeeAmount() {
        return minLcIssuanceFeeAmount;
    }

    /**
     * Sets the value of the minLcIssuanceFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setMinLcIssuanceFeeAmount(MoneyWithParticipantShare value) {
        this.minLcIssuanceFeeAmount = value;
    }

    /**
     * Gets the value of the facilityFxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxTerms }
     *     
     */
    public FxTerms getFacilityFxRate() {
        return facilityFxRate;
    }

    /**
     * Sets the value of the facilityFxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTerms }
     *     
     */
    public void setFacilityFxRate(FxTerms value) {
        this.facilityFxRate = value;
    }

}
