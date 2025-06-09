package org.example.model

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skill", propOrder = ["name"])
class Skill() {

    @XmlAttribute
    var hard: Boolean? = null

    @XmlAttribute
    var soft: Boolean? = null

    @XmlValue
    var name: String = ""

    constructor(name: String, hard: Boolean? = null, soft: Boolean? = null) : this() {
        this.name = name
        this.hard = hard
        this.soft = soft
    }
}



