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
 * A Repo, modeled as an FpML:Product. Note: this Repo model is a candidate model for further industry input.
 * 
 * <p>Java class for Repo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fixedRateSchedule" type="{http://www.fpml.org/FpML-5/master}Schedule"/>
 *           &lt;element name="floatingRateCalculation" type="{http://www.fpml.org/FpML-5/master}FloatingRateCalculation"/>
 *         &lt;/choice>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/master}DayCountFraction" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="duration" type="{http://www.fpml.org/FpML-5/master}RepoDurationEnum"/>
 *           &lt;sequence>
 *             &lt;element name="callingParty" type="{http://www.fpml.org/FpML-5/master}CallingPartyEnum" minOccurs="0"/>
 *             &lt;element name="callDate" type="{http://www.fpml.org/FpML-5/master}AdjustableOrRelativeDate" minOccurs="0"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element name="noticePeriod" type="{http://www.fpml.org/FpML-5/master}AdjustableOffset"/>
 *               &lt;element name="partyNoticePeriod" type="{http://www.fpml.org/FpML-5/master}PartyNoticePeriod" maxOccurs="2"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="initialMargin" type="{http://www.fpml.org/FpML-5/master}InitialMargin" minOccurs="0"/>
 *         &lt;element name="nearLeg" type="{http://www.fpml.org/FpML-5/master}RepoNearLeg" minOccurs="0"/>
 *         &lt;element name="farLeg" type="{http://www.fpml.org/FpML-5/master}RepoFarLeg" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}BondEquity.model" maxOccurs="unbounded"/>
 *           &lt;element name="triParty" type="{http://www.fpml.org/FpML-5/master}TriParty"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repo")
public class Repo
    extends Product
{


}
