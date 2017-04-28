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
 * A type describing the method for obtaining a settlement rate.
 * 
 * <p>Java class for SettlementRateSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementRateSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/master}InformationSource"/>
 *         &lt;element name="cashSettlementReferenceBanks" type="{http://www.fpml.org/FpML-5/master}CashSettlementReferenceBanks"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementRateSource", propOrder = {
    "informationSource",
    "cashSettlementReferenceBanks"
})
public class SettlementRateSource {

    protected InformationSource informationSource;
    protected CashSettlementReferenceBanks cashSettlementReferenceBanks;

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setInformationSource(InformationSource value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the cashSettlementReferenceBanks property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementReferenceBanks }
     *     
     */
    public CashSettlementReferenceBanks getCashSettlementReferenceBanks() {
        return cashSettlementReferenceBanks;
    }

    /**
     * Sets the value of the cashSettlementReferenceBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementReferenceBanks }
     *     
     */
    public void setCashSettlementReferenceBanks(CashSettlementReferenceBanks value) {
        this.cashSettlementReferenceBanks = value;
    }

}
