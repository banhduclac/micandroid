//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.23 at 02:16:13 PM PDT 
//


package org.light.portal.layout.config;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}url" minOccurs="0"/>
 *         &lt;element ref="{}defaulted"/>
 *         &lt;element ref="{}closeable"/>
 *         &lt;element ref="{}editable"/>
 *         &lt;element ref="{}moveable"/>
 *         &lt;element ref="{}allowAddContent"/>
 *         &lt;element ref="{}widths"/>
 *         &lt;element ref="{}between"/>
 *         &lt;element ref="{}portletWindow"/>
 *         &lt;element ref="{}color" minOccurs="0"/>
 *         &lt;element ref="{}portalTab" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}portlets" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "url",
    "defaulted",
    "closeable",
    "editable",
    "moveable",
    "allowAddContent",
    "widths",
    "between",
    "portletWindow",
    "color",
    "portalTab",
    "portlets"
})
@XmlRootElement(name = "portalTab")
public class PortalTab {

    @XmlElement(required = true)
    protected String title;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected boolean defaulted;
    protected boolean closeable;
    protected boolean editable;
    protected boolean moveable;
    protected boolean allowAddContent;
    @XmlElement(required = true)
    protected String widths;
    @XmlElement(required = true)
    protected BigInteger between;
    @XmlElement(required = true)
    protected String portletWindow;
    protected String color;
    protected List<PortalTab> portalTab;
    protected Portlets portlets;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the defaulted property.
     * 
     */
    public boolean isDefaulted() {
        return defaulted;
    }

    /**
     * Sets the value of the defaulted property.
     * 
     */
    public void setDefaulted(boolean value) {
        this.defaulted = value;
    }

    /**
     * Gets the value of the closeable property.
     * 
     */
    public boolean isCloseable() {
        return closeable;
    }

    /**
     * Sets the value of the closeable property.
     * 
     */
    public void setCloseable(boolean value) {
        this.closeable = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     */
    public void setEditable(boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the moveable property.
     * 
     */
    public boolean isMoveable() {
        return moveable;
    }

    /**
     * Sets the value of the moveable property.
     * 
     */
    public void setMoveable(boolean value) {
        this.moveable = value;
    }

    /**
     * Gets the value of the allowAddContent property.
     * 
     */
    public boolean isAllowAddContent() {
        return allowAddContent;
    }

    /**
     * Sets the value of the allowAddContent property.
     * 
     */
    public void setAllowAddContent(boolean value) {
        this.allowAddContent = value;
    }

    /**
     * Gets the value of the widths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidths() {
        return widths;
    }

    /**
     * Sets the value of the widths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidths(String value) {
        this.widths = value;
    }

    /**
     * Gets the value of the between property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBetween() {
        return between;
    }

    /**
     * Sets the value of the between property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBetween(BigInteger value) {
        this.between = value;
    }

    /**
     * Gets the value of the portletWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortletWindow() {
        return portletWindow;
    }

    /**
     * Sets the value of the portletWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortletWindow(String value) {
        this.portletWindow = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the portalTab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portalTab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortalTab }
     * 
     * 
     */
    public List<PortalTab> getPortalTab() {
        if (portalTab == null) {
            portalTab = new ArrayList<PortalTab>();
        }
        return this.portalTab;
    }

    /**
     * Gets the value of the portlets property.
     * 
     * @return
     *     possible object is
     *     {@link Portlets }
     *     
     */
    public Portlets getPortlets() {
        return portlets;
    }

    /**
     * Sets the value of the portlets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portlets }
     *     
     */
    public void setPortlets(Portlets value) {
        this.portlets = value;
    }

}