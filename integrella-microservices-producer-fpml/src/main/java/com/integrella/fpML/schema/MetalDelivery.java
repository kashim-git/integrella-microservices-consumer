//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The physical delivery conditions for the transaction.
 * 
 * <p>Java class for MetalDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetalDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryLocation" type="{http://www.fpml.org/FpML-5/master}CommodityDeliveryPoint" minOccurs="0"/>
 *         &lt;element name="risk" type="{http://www.fpml.org/FpML-5/master}CommodityDeliveryRisk" minOccurs="0"/>
 *         &lt;element name="totalQuantityTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodQuantityTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.fpml.org/FpML-5/master}MetalTitleEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetalDelivery", propOrder = {
    "deliveryLocation",
    "risk",
    "totalQuantityTolerance",
    "periodQuantityTolerance",
    "title"
})
public class MetalDelivery {

    protected CommodityDeliveryPoint deliveryLocation;
    protected CommodityDeliveryRisk risk;
    protected BigDecimal totalQuantityTolerance;
    protected BigDecimal periodQuantityTolerance;
    protected MetalTitleEnum title;

    /**
     * Gets the value of the deliveryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Sets the value of the deliveryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setDeliveryLocation(CommodityDeliveryPoint value) {
        this.deliveryLocation = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryRisk }
     *     
     */
    public CommodityDeliveryRisk getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryRisk }
     *     
     */
    public void setRisk(CommodityDeliveryRisk value) {
        this.risk = value;
    }

    /**
     * Gets the value of the totalQuantityTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalQuantityTolerance() {
        return totalQuantityTolerance;
    }

    /**
     * Sets the value of the totalQuantityTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalQuantityTolerance(BigDecimal value) {
        this.totalQuantityTolerance = value;
    }

    /**
     * Gets the value of the periodQuantityTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodQuantityTolerance() {
        return periodQuantityTolerance;
    }

    /**
     * Sets the value of the periodQuantityTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodQuantityTolerance(BigDecimal value) {
        this.periodQuantityTolerance = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link MetalTitleEnum }
     *     
     */
    public MetalTitleEnum getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalTitleEnum }
     *     
     */
    public void setTitle(MetalTitleEnum value) {
        this.title = value;
    }

}