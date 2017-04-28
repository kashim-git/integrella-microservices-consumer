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
 * An FX Accrual Digital Option product The product defines a list of fixing (or observation) dates. There are m total fixings. At the expiry date of the product, the buyer of the option has the right to an FX settlement with n/m * Notional. Payout can be cash or physical.
 * 
 * <p>Java class for FxAccrualDigitalOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualDigitalOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Option">
 *       &lt;sequence>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/master}NonNegativeAmountSchedule" minOccurs="0"/>
 *         &lt;element name="accrual" type="{http://www.fpml.org/FpML-5/master}FxAccrual" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FxExpiryDateOrSchedule.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FxSettlementDateOrSchedule.model"/>
 *         &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/master}ExerciseProcedure" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/master}FxAccrualTrigger" minOccurs="0"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/master}FxAccrualBarrier" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FxAccrualDigitalOption")
public class FxAccrualDigitalOption
    extends Option
{


}
