//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionsPrecedentMetEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionsPrecedentMetEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Waived"/>
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionsPrecedentMetEnum")
@XmlEnum
public enum ConditionsPrecedentMetEnum {


    /**
     * Conditions precedent have not been met.
     * 
     */
    @XmlEnumValue("No")
    NO("No"),

    /**
     * The requirement for conditions precedent were waived.
     * 
     */
    @XmlEnumValue("Waived")
    WAIVED("Waived"),

    /**
     * Conditions precedent have been met.
     * 
     */
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    ConditionsPrecedentMetEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionsPrecedentMetEnum fromValue(String v) {
        for (ConditionsPrecedentMetEnum c: ConditionsPrecedentMetEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
