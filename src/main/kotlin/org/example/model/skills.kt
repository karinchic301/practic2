package org.example.model

import jakarta.xml.bind.annotation.XmlElement
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.XmlAccessType

@XmlAccessorType(XmlAccessType.FIELD)
class Skills {
    @XmlElement(name = "skill")
    var skills: MutableList<Skill> = mutableListOf()
}
