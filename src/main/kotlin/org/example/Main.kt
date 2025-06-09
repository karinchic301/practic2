package org.example

import jakarta.xml.bind.JAXBContext
import jakarta.xml.bind.Marshaller
import org.example.model.*
import java.io.File

fun main() {
    val input = File("src/main/resources/students.xml")
    val output = File("students_updated.xml")

    val context = JAXBContext.newInstance(Students::class.java)
    val students = context.createUnmarshaller().unmarshal(input) as Students

    // Добавляем новый навык для каждого студента
    students.students.forEach {
        it.skills.skills.add(Skill(name = "Python", hard = true))
    }

    val marshaller = context.createMarshaller().apply {
        setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
    }
    marshaller.marshal(students, output)

    println("Done! Check students_updated.xml")
}
