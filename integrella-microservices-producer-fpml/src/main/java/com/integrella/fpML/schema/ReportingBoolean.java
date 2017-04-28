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
 * How a Boolean value is to be reported for this regulator.  Typically "true" or "false", but for ESMA "X" is also allowed, to indicate not supplied.
 * 
 * <p>Java class for ReportingBoolean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingBoolean">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master>Scheme">
 *       &lt;attribute name="reportingBooleanScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/reporting-boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingBoolean", propOrder = {
    "value"
})
public class ReportingBoolean {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "reportingBooleanScheme")
    protected String reportingBooleanScheme;

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
     * Gets the value of the reportingBooleanScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingBooleanScheme() {
        if (reportingBooleanScheme == null) {
            return "http://www.fpml.org/coding-scheme/reporting-boolean";
        } else {
            return reportingBooleanScheme;
        }
    }

    /**
     * Sets the value of the reportingBooleanScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingBooleanScheme(String value) {
        this.reportingBooleanScheme = value;
    }

}
