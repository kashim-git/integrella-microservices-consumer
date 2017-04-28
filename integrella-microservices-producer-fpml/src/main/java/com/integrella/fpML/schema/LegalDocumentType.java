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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The type of legal document.
 * 
 * <p>Java class for LegalDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/master}LegalDocumentName" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://www.fpml.org/FpML-5/master}LegalDocumentPublisher" minOccurs="0"/>
 *         &lt;element name="style" type="{http://www.fpml.org/FpML-5/master}LegalDocumentStyle" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.fpml.org/FpML-5/master}Token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalDocumentType", propOrder = {
    "name",
    "publisher",
    "style",
    "version"
})
public class LegalDocumentType {

    protected LegalDocumentName name;
    protected LegalDocumentPublisher publisher;
    protected LegalDocumentStyle style;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link LegalDocumentName }
     *     
     */
    public LegalDocumentName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalDocumentName }
     *     
     */
    public void setName(LegalDocumentName value) {
        this.name = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link LegalDocumentPublisher }
     *     
     */
    public LegalDocumentPublisher getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalDocumentPublisher }
     *     
     */
    public void setPublisher(LegalDocumentPublisher value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link LegalDocumentStyle }
     *     
     */
    public LegalDocumentStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalDocumentStyle }
     *     
     */
    public void setStyle(LegalDocumentStyle value) {
        this.style = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
