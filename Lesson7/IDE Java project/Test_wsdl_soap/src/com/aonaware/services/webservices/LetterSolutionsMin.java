
package com.aonaware.services.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="anagram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minLetters" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "anagram",
    "minLetters"
})
@XmlRootElement(name = "LetterSolutionsMin")
public class LetterSolutionsMin {

    protected String anagram;
    protected int minLetters;

    /**
     * Gets the value of the anagram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnagram() {
        return anagram;
    }

    /**
     * Sets the value of the anagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnagram(String value) {
        this.anagram = value;
    }

    /**
     * Gets the value of the minLetters property.
     * 
     */
    public int getMinLetters() {
        return minLetters;
    }

    /**
     * Sets the value of the minLetters property.
     * 
     */
    public void setMinLetters(int value) {
        this.minLetters = value;
    }

}
