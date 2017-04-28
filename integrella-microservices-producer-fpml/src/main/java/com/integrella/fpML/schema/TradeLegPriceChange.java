//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing a change to the size of a single leg or stream of a trade.
 * 
 * <p>Java class for TradeLegPriceChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeLegPriceChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="priceReference" type="{http://www.fpml.org/FpML-5/master}Reference"/>
 *           &lt;element name="instrumentId" type="{http://www.fpml.org/FpML-5/master}InstrumentId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="priceChangeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="newPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegPriceChange", propOrder = {
    "priceReference",
    "instrumentId",
    "priceChangeAmount",
    "newPrice"
})
public class TradeLegPriceChange {

    protected Reference priceReference;
    protected List<InstrumentId> instrumentId;
    protected BigDecimal priceChangeAmount;
    protected BigDecimal newPrice;

    /**
     * Gets the value of the priceReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPriceReference() {
        return priceReference;
    }

    /**
     * Sets the value of the priceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPriceReference(Reference value) {
        this.priceReference = value;
    }

    /**
     * Gets the value of the instrumentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentId }
     * 
     * 
     */
    public List<InstrumentId> getInstrumentId() {
        if (instrumentId == null) {
            instrumentId = new ArrayList<InstrumentId>();
        }
        return this.instrumentId;
    }

    /**
     * Gets the value of the priceChangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceChangeAmount() {
        return priceChangeAmount;
    }

    /**
     * Sets the value of the priceChangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceChangeAmount(BigDecimal value) {
        this.priceChangeAmount = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewPrice(BigDecimal value) {
        this.newPrice = value;
    }

}
