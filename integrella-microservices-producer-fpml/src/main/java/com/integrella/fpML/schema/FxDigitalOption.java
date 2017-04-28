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
 * Describes an option having a triggerable fixed payout.
 * 
 * <p>Java class for FxDigitalOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDigitalOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Option">
 *       &lt;sequence>
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/master}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="tenorPeriod" type="{http://www.fpml.org/FpML-5/master}Period" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;choice minOccurs="0">
 *             &lt;sequence>
 *               &lt;element name="americanExercise" type="{http://www.fpml.org/FpML-5/master}FxDigitalAmericanExercise" minOccurs="0"/>
 *               &lt;element name="touch" type="{http://www.fpml.org/FpML-5/master}FxTouch" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;sequence>
 *               &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/master}FxEuropeanExercise" minOccurs="0"/>
 *               &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/master}FxTrigger" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;/sequence>
 *           &lt;/choice>
 *           &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/master}ExerciseProcedure" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="payout" type="{http://www.fpml.org/FpML-5/master}FxOptionPayout" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/master}FxOptionPremium" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDigitalOption")
public class FxDigitalOption
    extends Option
{


}