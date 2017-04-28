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
 * <p>Java class for PositionMatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionMatchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.fpml.org/FpML-5/master}EventStatus" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="assertedPosition" type="{http://www.fpml.org/FpML-5/master}AssertedPosition" minOccurs="0"/>
 *             &lt;element name="proposedMatch" type="{http://www.fpml.org/FpML-5/master}PositionProposedMatch" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="allegedPosition" type="{http://www.fpml.org/FpML-5/master}AssertedPosition"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionMatchResult", propOrder = {
    "status",
    "assertedPosition",
    "proposedMatch",
    "allegedPosition"
})
public class PositionMatchResult {

    protected EventStatus status;
    protected AssertedPosition assertedPosition;
    protected List<PositionProposedMatch> proposedMatch;
    protected AssertedPosition allegedPosition;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus }
     *     
     */
    public EventStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus }
     *     
     */
    public void setStatus(EventStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the assertedPosition property.
     * 
     * @return
     *     possible object is
     *     {@link AssertedPosition }
     *     
     */
    public AssertedPosition getAssertedPosition() {
        return assertedPosition;
    }

    /**
     * Sets the value of the assertedPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertedPosition }
     *     
     */
    public void setAssertedPosition(AssertedPosition value) {
        this.assertedPosition = value;
    }

    /**
     * Gets the value of the proposedMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposedMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposedMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionProposedMatch }
     * 
     * 
     */
    public List<PositionProposedMatch> getProposedMatch() {
        if (proposedMatch == null) {
            proposedMatch = new ArrayList<PositionProposedMatch>();
        }
        return this.proposedMatch;
    }

    /**
     * Gets the value of the allegedPosition property.
     * 
     * @return
     *     possible object is
     *     {@link AssertedPosition }
     *     
     */
    public AssertedPosition getAllegedPosition() {
        return allegedPosition;
    }

    /**
     * Sets the value of the allegedPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertedPosition }
     *     
     */
    public void setAllegedPosition(AssertedPosition value) {
        this.allegedPosition = value;
    }

}
