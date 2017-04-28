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
 * A flexible description of the type or characteristics of an option or strategy, e.g. butterfly, condor, chooser. For use with Generic products in Transparency reporting. Generic products define a product that represents an OTC derivative transaction whose economics are not fully described using an FpML schema. In other views, generic products are present for convenience to support internal messaging and workflows that are cross-product. Generic products are not full trade representations as such they are not intended to be used for confirming trades.
 * 
 * <p>Java class for OptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master>Scheme">
 *       &lt;attribute name="optionTypeScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/option-type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionType", propOrder = {
    "value"
})
public class OptionType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "optionTypeScheme")
    protected String optionTypeScheme;

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
     * Gets the value of the optionTypeScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionTypeScheme() {
        if (optionTypeScheme == null) {
            return "http://www.fpml.org/coding-scheme/option-type";
        } else {
            return optionTypeScheme;
        }
    }

    /**
     * Sets the value of the optionTypeScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionTypeScheme(String value) {
        this.optionTypeScheme = value;
    }

}
