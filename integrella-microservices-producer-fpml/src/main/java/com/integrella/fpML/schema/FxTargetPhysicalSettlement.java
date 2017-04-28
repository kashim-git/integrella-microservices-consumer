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
 * <p>Java class for FxTargetPhysicalSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetPhysicalSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FxExchangedCurrency.model"/>
 *         &lt;element name="settlementAdjustmentStyle" type="{http://www.fpml.org/FpML-5/master}FxSettlementAdjustmentMethodEnum" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}StrikeOrStrikeReference.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetPhysicalSettlement", propOrder = {
    "exchangedCurrency1",
    "exchangedCurrency2",
    "settlementAdjustmentStyle",
    "strike",
    "strikeReference"
})
public class FxTargetPhysicalSettlement {

    protected FxExchangedCurrency exchangedCurrency1;
    protected FxExchangedCurrency exchangedCurrency2;
    protected FxSettlementAdjustmentMethodEnum settlementAdjustmentStyle;
    protected FxStrike strike;
    protected FxStrikeReference strikeReference;

    /**
     * Gets the value of the exchangedCurrency1 property.
     * 
     * @return
     *     possible object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public FxExchangedCurrency getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    /**
     * Sets the value of the exchangedCurrency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public void setExchangedCurrency1(FxExchangedCurrency value) {
        this.exchangedCurrency1 = value;
    }

    /**
     * Gets the value of the exchangedCurrency2 property.
     * 
     * @return
     *     possible object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public FxExchangedCurrency getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    /**
     * Sets the value of the exchangedCurrency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public void setExchangedCurrency2(FxExchangedCurrency value) {
        this.exchangedCurrency2 = value;
    }

    /**
     * Gets the value of the settlementAdjustmentStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FxSettlementAdjustmentMethodEnum }
     *     
     */
    public FxSettlementAdjustmentMethodEnum getSettlementAdjustmentStyle() {
        return settlementAdjustmentStyle;
    }

    /**
     * Sets the value of the settlementAdjustmentStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSettlementAdjustmentMethodEnum }
     *     
     */
    public void setSettlementAdjustmentStyle(FxSettlementAdjustmentMethodEnum value) {
        this.settlementAdjustmentStyle = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrike }
     *     
     */
    public FxStrike getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrike }
     *     
     */
    public void setStrike(FxStrike value) {
        this.strike = value;
    }

    /**
     * Gets the value of the strikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrikeReference }
     *     
     */
    public FxStrikeReference getStrikeReference() {
        return strikeReference;
    }

    /**
     * Sets the value of the strikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrikeReference }
     *     
     */
    public void setStrikeReference(FxStrikeReference value) {
        this.strikeReference = value;
    }

}
