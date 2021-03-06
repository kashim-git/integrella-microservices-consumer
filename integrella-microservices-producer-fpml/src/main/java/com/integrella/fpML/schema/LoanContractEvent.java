//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type for all loan contract-level business events.
 * 
 * <p>Java class for LoanContractEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanContractEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LoanEvent">
 *       &lt;sequence>
 *         &lt;element name="loanContractReference" type="{http://www.fpml.org/FpML-5/master}LoanContractReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractEvent", propOrder = {
    "loanContractReference"
})
@XmlSeeAlso({
    LoanContractBaseRateSet.class,
    LoanContractAdjustment.class,
    Repayment.class,
    LoanContractMaturityChange.class,
    InterestCapitalization.class,
    InterestPayment.class,
    Borrowing.class
})
public abstract class LoanContractEvent
    extends LoanEvent
{

    protected LoanContractReference loanContractReference;

    /**
     * Gets the value of the loanContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link LoanContractReference }
     *     
     */
    public LoanContractReference getLoanContractReference() {
        return loanContractReference;
    }

    /**
     * Sets the value of the loanContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanContractReference }
     *     
     */
    public void setLoanContractReference(LoanContractReference value) {
        this.loanContractReference = value;
    }

}
