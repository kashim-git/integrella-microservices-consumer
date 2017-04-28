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
 * <p>Java class for UpdateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateTypeEnum")
@XmlEnum
public enum UpdateTypeEnum {


    /**
     * The item is newly created since the last instance of this report.
     * 
     */
    @XmlEnumValue("Created")
    CREATED("Created"),

    /**
     * The item has been updated since the last instance of this report.
     * 
     */
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),

    /**
     * The item has been removed since the last version of this report.
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    UpdateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateTypeEnum fromValue(String v) {
        for (UpdateTypeEnum c: UpdateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
