//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a rounding direction and precision to be used in the rounding of a rate.
 * 
 * <p>Java class for Rounding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rounding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roundingDirection" type="{http://www.fpml.org/FpML-5/master}RoundingDirectionEnum" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rounding", propOrder = {
    "roundingDirection",
    "precision"
})
public class Rounding {

    protected RoundingDirectionEnum roundingDirection;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger precision;

    /**
     * Gets the value of the roundingDirection property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirectionEnum }
     *     
     */
    public RoundingDirectionEnum getRoundingDirection() {
        return roundingDirection;
    }

    /**
     * Sets the value of the roundingDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirectionEnum }
     *     
     */
    public void setRoundingDirection(RoundingDirectionEnum value) {
        this.roundingDirection = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

}