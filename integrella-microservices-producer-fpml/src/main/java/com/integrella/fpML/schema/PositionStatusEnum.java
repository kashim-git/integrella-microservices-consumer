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
 * <p>Java class for PositionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Existing"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionStatusEnum")
@XmlEnum
public enum PositionStatusEnum {


    /**
     * The position is open and has been newly added since the last position report.
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * The position is open and was present in the last position report.
     * 
     */
    @XmlEnumValue("Existing")
    EXISTING("Existing"),

    /**
     * The position is no longer open, for example because it has matured, was assigned, or was terminated.
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    PositionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionStatusEnum fromValue(String v) {
        for (PositionStatusEnum c: PositionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
