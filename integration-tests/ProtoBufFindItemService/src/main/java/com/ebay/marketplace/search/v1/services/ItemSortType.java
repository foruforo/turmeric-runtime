//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.07 at 12:06:52 PM GMT+05:30 
//


package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSortType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}SortTypeBase">
 *       &lt;sequence>
 *         &lt;element name="sortTypeEnum" type="{http://www.ebay.com/marketplace/search/v1/services}ItemSortTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSortType", propOrder = {
    "sortTypeEnum"
})
public class ItemSortType
    extends SortTypeBase
{

    @XmlElement(required = true)
    protected ItemSortTypeEnum sortTypeEnum;

    /**
     * Gets the value of the sortTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSortTypeEnum }
     *     
     */
    public ItemSortTypeEnum getSortTypeEnum() {
        return sortTypeEnum;
    }

    /**
     * Sets the value of the sortTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSortTypeEnum }
     *     
     */
    public void setSortTypeEnum(ItemSortTypeEnum value) {
        this.sortTypeEnum = value;
    }

}
