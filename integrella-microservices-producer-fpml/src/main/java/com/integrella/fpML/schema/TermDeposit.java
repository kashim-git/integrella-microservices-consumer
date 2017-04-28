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
 * A class defining the content model for a term deposit product.
 * 
 * <p>Java class for TermDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermDeposit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PayerReceiver.model"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FxTenor.model" minOccurs="0"/>
 *         &lt;element name="principal" type="{http://www.fpml.org/FpML-5/master}PositiveMoney" minOccurs="0"/>
 *         &lt;element name="fixedRate" type="{http://www.fpml.org/FpML-5/master}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/master}DayCountFraction" minOccurs="0"/>
 *         &lt;element name="features" type="{http://www.fpml.org/FpML-5/master}TermDepositFeatures" minOccurs="0"/>
 *         &lt;element name="interest" type="{http://www.fpml.org/FpML-5/master}Money" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/master}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermDeposit")
public class TermDeposit
    extends Product
{


}
