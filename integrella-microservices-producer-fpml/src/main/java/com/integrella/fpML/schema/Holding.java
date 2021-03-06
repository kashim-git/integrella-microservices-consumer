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
 * A net accumulated position held in an asset.
 * 
 * <p>Java class for Holding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}underlyingAsset" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.fpml.org/FpML-5/master}InstrumentTradeQuantity" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/master}PositionTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holding", propOrder = {
    "underlyingAsset",
    "quantity",
    "type"
})
public class Holding {

    @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Asset> underlyingAsset;
    protected InstrumentTradeQuantity quantity;
    protected PositionTypeEnum type;

    /**
     * The FpML asset description for the asset.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Loan }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Future }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Asset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Cash }{@code >}
     *     {@link JAXBElement }{@code <}{@link Basket }{@code >}
     *     {@link JAXBElement }{@code <}{@link Index }{@code >}
     *     {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     *     
     */
    public JAXBElement<? extends Asset> getUnderlyingAsset() {
        return underlyingAsset;
    }

    /**
     * Sets the value of the underlyingAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Loan }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Future }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Asset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Cash }{@code >}
     *     {@link JAXBElement }{@code <}{@link Basket }{@code >}
     *     {@link JAXBElement }{@code <}{@link Index }{@code >}
     *     {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     *     
     */
    public void setUnderlyingAsset(JAXBElement<? extends Asset> value) {
        this.underlyingAsset = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTradeQuantity }
     *     
     */
    public InstrumentTradeQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTradeQuantity }
     *     
     */
    public void setQuantity(InstrumentTradeQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PositionTypeEnum }
     *     
     */
    public PositionTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionTypeEnum }
     *     
     */
    public void setType(PositionTypeEnum value) {
        this.type = value;
    }

}
