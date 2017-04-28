//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the common features of equity derivatives.
 * 
 * <p>Java class for EquityDerivativeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityDerivativeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model"/>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/master}EquityOptionTypeEnum" minOccurs="0"/>
 *         &lt;element name="equityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/master}Underlyer" minOccurs="0"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/master}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="equityExercise" type="{http://www.fpml.org/FpML-5/master}EquityExerciseValuationSettlement" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}Feature.model" minOccurs="0"/>
 *         &lt;element name="strategyFeature" type="{http://www.fpml.org/FpML-5/master}StrategyFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivativeBase")
@XmlSeeAlso({
    EquityDerivativeShortFormBase.class,
    EquityDerivativeLongFormBase.class
})
public abstract class EquityDerivativeBase
    extends Product
{


}
