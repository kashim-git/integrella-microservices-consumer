//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identification of the border(s) or border point(s) of a transportation contract. Use the list of EIC codes for timelines for electricity (T Codes) or the list of EIC codes for measurement points for gas (Z Codes).
 * 
 * <p>Java class for InterconnectionPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterconnectionPoint">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master>Scheme">
 *       &lt;attribute name="interconnectionPointScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/external/eic-codes" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterconnectionPoint", propOrder = {
    "value"
})
public class InterconnectionPoint {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "interconnectionPointScheme")
    protected String interconnectionPointScheme;

    /**
     * The base class for all types which define coding schemes that are allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the interconnectionPointScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterconnectionPointScheme() {
        if (interconnectionPointScheme == null) {
            return "http://www.fpml.org/coding-scheme/external/eic-codes";
        } else {
            return interconnectionPointScheme;
        }
    }

    /**
     * Sets the value of the interconnectionPointScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterconnectionPointScheme(String value) {
        this.interconnectionPointScheme = value;
    }

}
