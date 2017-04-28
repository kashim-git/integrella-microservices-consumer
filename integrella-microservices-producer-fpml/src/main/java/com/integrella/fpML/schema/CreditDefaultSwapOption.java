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
 * A complex type to support the credit default swap option.
 * 
 * <p>Java class for CreditDefaultSwapOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDefaultSwapOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}OptionBaseExtended">
 *       &lt;sequence>
 *         &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/master}SwaptionPhysicalSettlement" minOccurs="0"/>
 *         &lt;element name="strike" type="{http://www.fpml.org/FpML-5/master}CreditOptionStrike" minOccurs="0"/>
 *         &lt;element name="creditDefaultSwap" type="{http://www.fpml.org/FpML-5/master}CreditDefaultSwap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapOption")
public class CreditDefaultSwapOption
    extends OptionBaseExtended
{


}
