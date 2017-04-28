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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Assets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}underlyingAsset" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assets", propOrder = {
    "underlyingAsset"
})
public class Assets {

    @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Asset>> underlyingAsset;

    /**
     * Gets the value of the underlyingAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlyingAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlyingAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Loan }{@code >}
     * {@link JAXBElement }{@code <}{@link Bond }{@code >}
     * {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     * {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     * {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     * {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     * {@link JAXBElement }{@code <}{@link Future }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     * {@link JAXBElement }{@code <}{@link Asset }{@code >}
     * {@link JAXBElement }{@code <}{@link Cash }{@code >}
     * {@link JAXBElement }{@code <}{@link Basket }{@code >}
     * {@link JAXBElement }{@code <}{@link Index }{@code >}
     * {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Asset>> getUnderlyingAsset() {
        if (underlyingAsset == null) {
            underlyingAsset = new ArrayList<JAXBElement<? extends Asset>>();
        }
        return this.underlyingAsset;
    }

}