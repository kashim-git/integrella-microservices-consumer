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
 * The economics of a trade of a multiply traded instrument.
 * 
 * <p>Java class for InstrumentTradeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTradeDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}underlyingAsset" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.fpml.org/FpML-5/master}InstrumentTradeQuantity" minOccurs="0"/>
 *         &lt;element name="pricing" type="{http://www.fpml.org/FpML-5/master}InstrumentTradePricing" minOccurs="0"/>
 *         &lt;element name="principal" type="{http://www.fpml.org/FpML-5/master}InstrumentTradePrincipal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTradeDetails")
public class InstrumentTradeDetails
    extends Product
{


}
