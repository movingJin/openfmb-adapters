//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Weather curve
 * 
 * <p>Java class for WeatherData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Humidity" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}Humidity" minOccurs="0"/&gt;
 *         &lt;element name="SunRadiation" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}SunRadiation" minOccurs="0"/&gt;
 *         &lt;element name="Temperature" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="Wind" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}Wind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherData", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule", propOrder = {
    "interval",
    "source",
    "version",
    "versionDateTime",
    "humidity",
    "sunRadiation",
    "temperature",
    "wind"
})
@XmlRootElement(name = "WeatherData", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule")
public class WeatherData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String interval;
    protected String source;
    protected String version;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDateTime;
    @XmlElement(name = "Humidity")
    protected Humidity humidity;
    @XmlElement(name = "SunRadiation")
    protected SunRadiation sunRadiation;
    @XmlElement(name = "Temperature")
    protected Temperature temperature;
    @XmlElement(name = "Wind")
    protected Wind wind;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterval(String value) {
        this.interval = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDateTime() {
        return versionDateTime;
    }

    /**
     * Sets the value of the versionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionDateTime(XMLGregorianCalendar value) {
        this.versionDateTime = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the sunRadiation property.
     * 
     * @return
     *     possible object is
     *     {@link SunRadiation }
     *     
     */
    public SunRadiation getSunRadiation() {
        return sunRadiation;
    }

    /**
     * Sets the value of the sunRadiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SunRadiation }
     *     
     */
    public void setSunRadiation(SunRadiation value) {
        this.sunRadiation = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

}