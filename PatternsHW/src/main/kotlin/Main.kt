package org.example

import org.example.Classes.Builders.ProjectReportBuilder
import org.example.Classes.Builders.ResearchReportBuilder

fun main() {
    println("Первый билдер")

    val builder1 = ProjectReportBuilder()
    builder1.setName("")
    builder1.setName("Quest project")
    builder1.setTask("Create a functional web program for organizing quests")
    builder1.setScientificAdviser("Andrew Redwood")

    println(builder1.getJSONResult())

    builder1.setExecutor("Victoria Nellenburg")
    builder1.setAnnotation("Please pay attention to the deadlines")
    builder1.setReportString("Nothing yet")
    builder1.setListOfSources("Youtube indians")

    println(builder1.getJSONResult())

    println("Второй билдер")

    val builder2 = ResearchReportBuilder()
    builder2.setName("Something difficult")
    builder2.setTask("Read many research papers and do some calculations and experiments")
    builder2.setFieldOfStudy("Mathematics")

    println(builder2.getJSONResult())

    println()
    builder2.setTypeOfResearch("Mathematical")
    builder2.setAnnotation("Think like a humanitarian")
    builder2.setReportString("Water water water")
    builder2.setListOfSources("Wikipedia?")

    println(builder2.getJSONResult())
}