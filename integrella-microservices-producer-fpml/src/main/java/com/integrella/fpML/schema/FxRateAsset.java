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
 * <p>Java class for FxRateAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxRateAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/master}QuotedCurrencyPair" minOccurs="0"/>
 *         &lt;element name="rateSource" type="{http://www.fpml.org/FpML-5/master}FxSpotRateSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxRateAsset", propOrder = {
    "quotedCurrencyPair",
    "rateSource"
})
public class FxRateAsset
    extends UnderlyingAsset
{

    protected QuotedCurrencyPair quotedCurrencyPair;
    protected FxSpotRateSource rateSource;

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FxSpotRateSource }
     *     
     */
    public FxSpotRateSource getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSpotRateSource }
     *     
     */
    public void setRateSource(FxSpotRateSource value) {
        this.rateSource = value;
    }

}