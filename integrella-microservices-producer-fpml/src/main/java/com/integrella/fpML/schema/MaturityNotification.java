//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A message used to notify another party that a trade has matured. This can be used to report, for example, that a swap has passed its final payment and can be removed, or that an option has expired without being executed.
 * 
 * <p>Java class for MaturityNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaturityNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}CorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="optionExpiry" type="{http://www.fpml.org/FpML-5/master}OptionExpiryBase"/>
 *           &lt;element name="tradeMaturity" type="{http://www.fpml.org/FpML-5/master}TradeMaturity"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartiesAndAccounts.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaturityNotification", propOrder = {
    "optionExpiry",
    "tradeMaturity",
    "party",
    "account"
})
public class MaturityNotification
    extends CorrectableRequestMessage
{

    protected OptionExpiryBase optionExpiry;
    protected TradeMaturity tradeMaturity;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the optionExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link OptionExpiryBase }
     *     
     */
    public OptionExpiryBase getOptionExpiry() {
        return optionExpiry;
    }

    /**
     * Sets the value of the optionExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionExpiryBase }
     *     
     */
    public void setOptionExpiry(OptionExpiryBase value) {
        this.optionExpiry = value;
    }

    /**
     * Gets the value of the tradeMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMaturity }
     *     
     */
    public TradeMaturity getTradeMaturity() {
        return tradeMaturity;
    }

    /**
     * Sets the value of the tradeMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMaturity }
     *     
     */
    public void setTradeMaturity(TradeMaturity value) {
        this.tradeMaturity = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
