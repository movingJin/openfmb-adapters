//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Resource status module
 * 
 * <p>Java class for ResourceStatusProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceStatusProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PowerSystemResource" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}PowerSystemResource"/&gt;
 *         &lt;element name="StringMeasurements" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}StringMeasurement" maxOccurs="100"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceStatusProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/resourcemodule", propOrder = {
    "powerSystemResource",
    "stringMeasurements"
})
@XmlRootElement(name = "ResourceStatusProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/resourcemodule")
public class ResourceStatusProfile
    extends Container
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PowerSystemResource", required = true)
    protected PowerSystemResource powerSystemResource;
    @XmlElement(name = "StringMeasurements", required = true)
    protected List<StringMeasurement> stringMeasurements;

    /**
     * Gets the value of the powerSystemResource property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSystemResource }
     *     
     */
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * Sets the value of the powerSystemResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSystemResource }
     *     
     */
    public void setPowerSystemResource(PowerSystemResource value) {
        this.powerSystemResource = value;
    }

    /**
     * Gets the value of the stringMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMeasurement }
     * 
     * 
     */
    public List<StringMeasurement> getStringMeasurements() {
        if (stringMeasurements == null) {
            stringMeasurements = new ArrayList<StringMeasurement>();
        }
        return this.stringMeasurements;
    }

}