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
 * <p>Java class for FloatingStrikePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingStrikePrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FloatingLegCalculation">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}commodity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingStrikePrice", propOrder = {
    "commodity"
})
public class FloatingStrikePrice
    extends FloatingLegCalculation
{

    protected Commodity commodity;

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity }
     *     
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity }
     *     
     */
    public void setCommodity(Commodity value) {
        this.commodity = value;
    }

}
