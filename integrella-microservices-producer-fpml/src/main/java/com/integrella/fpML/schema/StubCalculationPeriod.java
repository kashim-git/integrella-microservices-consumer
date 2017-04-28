//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the Stub Calculation Period.
 * 
 * <p>Java class for StubCalculationPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StubCalculationPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="initialStub" type="{http://www.fpml.org/FpML-5/master}Stub"/>
 *           &lt;element name="finalStub" type="{http://www.fpml.org/FpML-5/master}Stub" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="finalStub" type="{http://www.fpml.org/FpML-5/master}Stub"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StubCalculationPeriod", propOrder = {
    "content"
})
public class StubCalculationPeriod {

    @XmlElementRefs({
        @XmlElementRef(name = "initialStub", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "finalStub", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Stub>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FinalStub" is used by two different parts of a schema. See: 
     * line 1770 of file:/C:/DEV/git/integrella/integrella-microservices-producer-fpml/src/main/xsd/schema/fpml-eq-shared.xsd
     * line 1768 of file:/C:/DEV/git/integrella/integrella-microservices-producer-fpml/src/main/xsd/schema/fpml-eq-shared.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Stub }{@code >}
     * {@link JAXBElement }{@code <}{@link Stub }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Stub>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<Stub>>();
        }
        return this.content;
    }

}
