package org.example.model

import jakarta.xml.bind.annotation.XmlElement
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.XmlAccessType

@XmlAccessorType(XmlAccessType.FIELD)
class Student {
    @XmlElement(name = "first_name")
    var firstName: String? = null

    @XmlElement(name = "second_name")
    var secondName: String? = null

    @XmlElement(name = "skills")
    var skills: Skills = Skills()
}
