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
 * A type describing the variance amount of a variance swap.
 * 
 * <p>Java class for Variance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}CalculationFromObservation">
 *       &lt;sequence>
 *         &lt;element name="varianceAmount" type="{http://www.fpml.org/FpML-5/master}NonNegativeMoney" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="volatilityStrikePrice" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal"/>
 *           &lt;element name="varianceStrikePrice" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal"/>
 *         &lt;/choice>
 *         &lt;element name="varianceCap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unadjustedVarianceCap" type="{http://www.fpml.org/FpML-5/master}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="boundedVariance" type="{http://www.fpml.org/FpML-5/master}BoundedVariance" minOccurs="0"/>
 *         &lt;element name="exchangeTradedContractNearest" type="{http://www.fpml.org/FpML-5/master}ExchangeTradedContract" minOccurs="0"/>
 *         &lt;element name="vegaNotionalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance")
public class Variance
    extends CalculationFromObservation
{


}