//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes how an option settles into a physical trade.
 * 
 * <p>Java class for PhysicalSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="resultingTradeIdentifier" type="{http://www.fpml.org/FpML-5/master}PartyTradeIdentifier"/>
 *         &lt;element name="resultingTrade" type="{http://www.fpml.org/FpML-5/master}Trade"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}product"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalSettlement", propOrder = {
    "resultingTradeIdentifier",
    "resultingTrade",
    "product"
})
public class PhysicalSettlement {

    protected PartyTradeIdentifier resultingTradeIdentifier;
    protected Trade resultingTrade;
    @XmlElementRef(name = "product", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Product> product;

    /**
     * Gets the value of the resultingTradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getResultingTradeIdentifier() {
        return resultingTradeIdentifier;
    }

    /**
     * Sets the value of the resultingTradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setResultingTradeIdentifier(PartyTradeIdentifier value) {
        this.resultingTradeIdentifier = value;
    }

    /**
     * Gets the value of the resultingTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getResultingTrade() {
        return resultingTrade;
    }

    /**
     * Sets the value of the resultingTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setResultingTrade(Trade value) {
        this.resultingTrade = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DividendSwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxForwardVolatilityAgreement }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fra }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardProduct }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForwardSale }{@code >}
     *     {@link JAXBElement }{@code <}{@link CapFloor }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityOptionTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link BrokerEquityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxAccrualOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolatilitySwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarianceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link CorrelationSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxFlexibleForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxTargetKnockoutForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxRangeAccrual }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityBasketOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxAccrualForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquitySwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwapOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarianceOptionTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxSingleLeg }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Swap }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolatilitySwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link DividendSwapOptionTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link BulletPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxAccrualDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReturnSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Repo }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermDeposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link BondOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Swaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarianceSwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericProduct }{@code >}
     *     
     */
    public JAXBElement<? extends Product> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DividendSwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxForwardVolatilityAgreement }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fra }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardProduct }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForwardSale }{@code >}
     *     {@link JAXBElement }{@code <}{@link CapFloor }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityOptionTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link BrokerEquityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxAccrualOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolatilitySwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarianceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link CorrelationSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxFlexibleForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxTargetKnockoutForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxRangeAccrual }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityBasketOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxAccrualForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquitySwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwapOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarianceOptionTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxSingleLeg }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Swap }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolatilitySwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link DividendSwapOptionTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link BulletPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxAccrualDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReturnSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Repo }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link FxPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermDeposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link BondOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Swaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarianceSwapTransactionSupplement }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericProduct }{@code >}
     *     
     */
    public void setProduct(JAXBElement<? extends Product> value) {
        this.product = value;
    }

}
