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
 * A type defining a Forward Rate Agreement (FRA) product.
 * 
 * <p>Java class for Fra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fra">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model"/>
 *         &lt;sequence>
 *           &lt;element name="adjustedEffectiveDate" type="{http://www.fpml.org/FpML-5/master}RequiredIdentifierDate"/>
 *           &lt;element name="adjustedTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="forwardTenor" type="{http://www.fpml.org/FpML-5/master}Period"/>
 *             &lt;element name="maturityTenor" type="{http://www.fpml.org/FpML-5/master}Period"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;sequence>
 *               &lt;element name="adjustedEffectiveDate" type="{http://www.fpml.org/FpML-5/master}RequiredIdentifierDate"/>
 *               &lt;element name="adjustedTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             &lt;/sequence>
 *             &lt;sequence minOccurs="0">
 *               &lt;element name="forwardTenor" type="{http://www.fpml.org/FpML-5/master}Period"/>
 *               &lt;element name="maturityTenor" type="{http://www.fpml.org/FpML-5/master}Period"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/master}AdjustableDate" minOccurs="0"/>
 *         &lt;element name="fixingDateOffset" type="{http://www.fpml.org/FpML-5/master}RelativeDateOffset" minOccurs="0"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/master}DayCountFraction" minOccurs="0"/>
 *         &lt;element name="calculationPeriodNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/master}Money" minOccurs="0"/>
 *         &lt;element name="fixedRate" type="{http://www.fpml.org/FpML-5/master}IdentifiedRate" minOccurs="0"/>
 *         &lt;element name="floatingRateIndex" type="{http://www.fpml.org/FpML-5/master}FloatingRateIndex" minOccurs="0"/>
 *         &lt;element name="indexTenor" type="{http://www.fpml.org/FpML-5/master}Period" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fraDiscounting" type="{http://www.fpml.org/FpML-5/master}FraDiscountingEnum" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/master}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fra")
public class Fra
    extends Product
{


}