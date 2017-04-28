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
 * Defines stock loan information where this is required per underlyer. You must not duplicate infromation within dividend conditions at transaction level
 * 
 * <p>Java class for UnderlyerLoanRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyerLoanRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}StockLoan.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyerLoanRate", propOrder = {
    "lossOfStockBorrow",
    "maximumStockLoanRate",
    "increasedCostOfStockBorrow",
    "initialStockLoanRate"
})
public class UnderlyerLoanRate {

    protected Boolean lossOfStockBorrow;
    protected BigDecimal maximumStockLoanRate;
    protected Boolean increasedCostOfStockBorrow;
    protected BigDecimal initialStockLoanRate;

    /**
     * Gets the value of the lossOfStockBorrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLossOfStockBorrow() {
        return lossOfStockBorrow;
    }

    /**
     * Sets the value of the lossOfStockBorrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLossOfStockBorrow(Boolean value) {
        this.lossOfStockBorrow = value;
    }

    /**
     * Gets the value of the maximumStockLoanRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStockLoanRate() {
        return maximumStockLoanRate;
    }

    /**
     * Sets the value of the maximumStockLoanRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumStockLoanRate(BigDecimal value) {
        this.maximumStockLoanRate = value;
    }

    /**
     * Gets the value of the increasedCostOfStockBorrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncreasedCostOfStockBorrow() {
        return increasedCostOfStockBorrow;
    }

    /**
     * Sets the value of the increasedCostOfStockBorrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncreasedCostOfStockBorrow(Boolean value) {
        this.increasedCostOfStockBorrow = value;
    }

    /**
     * Gets the value of the initialStockLoanRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialStockLoanRate() {
        return initialStockLoanRate;
    }

    /**
     * Sets the value of the initialStockLoanRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialStockLoanRate(BigDecimal value) {
        this.initialStockLoanRate = value;
    }

}
