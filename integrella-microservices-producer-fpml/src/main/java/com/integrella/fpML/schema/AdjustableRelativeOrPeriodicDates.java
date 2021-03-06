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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AdjustableRelativeOrPeriodicDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableRelativeOrPeriodicDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="adjustableDates" type="{http://www.fpml.org/FpML-5/master}AdjustableDates"/>
 *         &lt;element name="relativeDates" type="{http://www.fpml.org/FpML-5/master}RelativeDates"/>
 *         &lt;element name="relativeDateSequence" type="{http://www.fpml.org/FpML-5/master}RelativeDateSequence"/>
 *         &lt;element name="periodicDates" type="{http://www.fpml.org/FpML-5/master}PeriodicDates"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustableRelativeOrPeriodicDates", propOrder = {
    "adjustableDates",
    "relativeDates",
    "relativeDateSequence",
    "periodicDates"
})
public class AdjustableRelativeOrPeriodicDates {

    protected AdjustableDates adjustableDates;
    protected RelativeDates relativeDates;
    protected RelativeDateSequence relativeDateSequence;
    protected PeriodicDates periodicDates;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the adjustableDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    /**
     * Sets the value of the adjustableDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setAdjustableDates(AdjustableDates value) {
        this.adjustableDates = value;
    }

    /**
     * Gets the value of the relativeDates property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDates }
     *     
     */
    public RelativeDates getRelativeDates() {
        return relativeDates;
    }

    /**
     * Sets the value of the relativeDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDates }
     *     
     */
    public void setRelativeDates(RelativeDates value) {
        this.relativeDates = value;
    }

    /**
     * Gets the value of the relativeDateSequence property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateSequence }
     *     
     */
    public RelativeDateSequence getRelativeDateSequence() {
        return relativeDateSequence;
    }

    /**
     * Sets the value of the relativeDateSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateSequence }
     *     
     */
    public void setRelativeDateSequence(RelativeDateSequence value) {
        this.relativeDateSequence = value;
    }

    /**
     * Gets the value of the periodicDates property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicDates }
     *     
     */
    public PeriodicDates getPeriodicDates() {
        return periodicDates;
    }

    /**
     * Sets the value of the periodicDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicDates }
     *     
     */
    public void setPeriodicDates(PeriodicDates value) {
        this.periodicDates = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
