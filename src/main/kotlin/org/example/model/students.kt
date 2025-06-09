package org.example.model

import jakarta.xml.bind.annotation.XmlRootElement
import jakarta.xml.bind.annotation.XmlElement
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.XmlAccessType

@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
class Students {
    @XmlElement(name = "student")
    var students: MutableList<Student> = mutableListOf()
}
