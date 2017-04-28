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
 * A type describing the fixed income leg of the equity swap.
 * 
 * <p>Java class for InterestLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}DirectionalLeg">
 *       &lt;sequence>
 *         &lt;element name="interestLegCalculationPeriodDates" type="{http://www.fpml.org/FpML-5/master}InterestLegCalculationPeriodDates" minOccurs="0"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/master}ReturnSwapNotional" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{http://www.fpml.org/FpML-5/master}LegAmount" minOccurs="0"/>
 *         &lt;element name="interestCalculation" type="{http://www.fpml.org/FpML-5/master}InterestCalculation" minOccurs="0"/>
 *         &lt;element name="stubCalculationPeriod" type="{http://www.fpml.org/FpML-5/master}StubCalculationPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestLeg", propOrder = {
    "interestLegCalculationPeriodDates",
    "notional",
    "interestAmount",
    "interestCalculation",
    "stubCalculationPeriod"
})
public class InterestLeg
    extends DirectionalLeg
{

    protected InterestLegCalculationPeriodDates interestLegCalculationPeriodDates;
    protected ReturnSwapNotional notional;
    protected LegAmount interestAmount;
    protected InterestCalculation interestCalculation;
    protected StubCalculationPeriod stubCalculationPeriod;

    /**
     * Gets the value of the interestLegCalculationPeriodDates property.
     * 
     * @return
     *     possible object is
     *     {@link InterestLegCalculationPeriodDates }
     *     
     */
    public InterestLegCalculationPeriodDates getInterestLegCalculationPeriodDates() {
        return interestLegCalculationPeriodDates;
    }

    /**
     * Sets the value of the interestLegCalculationPeriodDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestLegCalculationPeriodDates }
     *     
     */
    public void setInterestLegCalculationPeriodDates(InterestLegCalculationPeriodDates value) {
        this.interestLegCalculationPeriodDates = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public ReturnSwapNotional getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public void setNotional(ReturnSwapNotional value) {
        this.notional = value;
    }

    /**
     * Gets the value of the interestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LegAmount }
     *     
     */
    public LegAmount getInterestAmount() {
        return interestAmount;
    }

    /**
     * Sets the value of the interestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegAmount }
     *     
     */
    public void setInterestAmount(LegAmount value) {
        this.interestAmount = value;
    }

    /**
     * Gets the value of the interestCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCalculation }
     *     
     */
    public InterestCalculation getInterestCalculation() {
        return interestCalculation;
    }

    /**
     * Sets the value of the interestCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCalculation }
     *     
     */
    public void setInterestCalculation(InterestCalculation value) {
        this.interestCalculation = value;
    }

    /**
     * Gets the value of the stubCalculationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StubCalculationPeriod }
     *     
     */
    public StubCalculationPeriod getStubCalculationPeriod() {
        return stubCalculationPeriod;
    }

    /**
     * Sets the value of the stubCalculationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StubCalculationPeriod }
     *     
     */
    public void setStubCalculationPeriod(StubCalculationPeriod value) {
        this.stubCalculationPeriod = value;
    }

}
