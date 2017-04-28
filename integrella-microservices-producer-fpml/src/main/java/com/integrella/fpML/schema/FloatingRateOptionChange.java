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
 * An event describing a change in a floating rate accrual option. In real terms - an example of this would be a margin rate change associated with the 3-Month LIBOR accrual option.
 * 
 * <p>Java class for FloatingRateOptionChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRateOptionChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityEvent">
 *       &lt;sequence>
 *         &lt;element name="floatingRateOption" type="{http://www.fpml.org/FpML-5/master}FloatingRateOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateOptionChange", propOrder = {
    "floatingRateOption"
})
public class FloatingRateOptionChange
    extends FacilityEvent
{

    protected FloatingRateOption floatingRateOption;

    /**
     * Gets the value of the floatingRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateOption }
     *     
     */
    public FloatingRateOption getFloatingRateOption() {
        return floatingRateOption;
    }

    /**
     * Sets the value of the floatingRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateOption }
     *     
     */
    public void setFloatingRateOption(FloatingRateOption value) {
        this.floatingRateOption = value;
    }

}