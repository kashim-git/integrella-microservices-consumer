//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the underlyer features of a basket swap. Each of the basket constituents are described through an embedded component, the basketConstituentsType.
 * 
 * <p>Java class for Basket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basket">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Asset">
 *       &lt;sequence>
 *         &lt;element name="openUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="basketConstituent" type="{http://www.fpml.org/FpML-5/master}BasketConstituent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basketDivisor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="basketVersion" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BasketIdentifier.model" minOccurs="0"/>
 *         &lt;element name="basketCurrency" type="{http://www.fpml.org/FpML-5/master}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basket", propOrder = {
    "rest"
})
public class Basket
    extends Asset
{

    @XmlElementRefs({
        @XmlElementRef(name = "basketConstituent", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "basketName", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "basketCurrency", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "basketDivisor", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "basketId", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "openUnits", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "basketVersion", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "BasketId" is used by two different parts of a schema. See: 
     * line 1607 of file:/C:/DEV/git/integrella/integrella-microservices-producer-fpml/src/main/xsd/schema/fpml-asset.xsd
     * line 1601 of file:/C:/DEV/git/integrella/integrella-microservices-producer-fpml/src/main/xsd/schema/fpml-asset.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BasketConstituent }{@code >}
     * {@link JAXBElement }{@code <}{@link BasketName }{@code >}
     * {@link JAXBElement }{@code <}{@link Currency }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BasketId }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
