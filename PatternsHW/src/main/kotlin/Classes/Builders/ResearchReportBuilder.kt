package org.example.Classes.Builders

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.Classes.Reports.ResearchReport
import org.example.Classes.Singleton.Logger.Companion.GetLogger

@Serializable
class ResearchReportBuilder : ReportBuilder {
    private val result = ResearchReport()
    private val module = "ScienceReportBuilder"

    override fun reset() {
        result.reportString = ""
        result.header = ""
        result.name = ""
        result.task = ""
        result.fieldOfStudy = ""
        result.researchResults = ""
        result.listOfSources = ""
        result.annotation = ""
        val logger = GetLogger()
        logger.InfoLog(module, "reset")
    }

    override fun setName(name: String) {
        val logger = GetLogger()
        if (name == "") {
            logger.WarningLog(module, "set empty name")
        }
        else {
            logger.InfoLog(module, "set name")
        }
        result.name = name
    }

    override fun setTask(task: String) {
        val logger = GetLogger()
        if (task == "") {
            logger.WarningLog(module, "set empty task")
        }
        else {
            logger.InfoLog(module, "set task")
        }
        result.task = task
    }

    override fun setAnnotation(annotation: String) {
        val logger = GetLogger()
        if (annotation == "") {
            logger.WarningLog(module, "set empty annotation")
        }
        else {
            logger.InfoLog(module, "set annotation")
        }
        result.annotation = annotation
    }

    override fun setHeader(header: String) {
        val logger = GetLogger()
        if (header == "") {
            logger.WarningLog(module, "set empty header")
        }
        else {
            logger.InfoLog(module, "set header")
        }
        result.header = header
    }

    override fun setReportString(report: String) {
        val logger = GetLogger()
        if (report == "") {
            logger.WarningLog(module, "set empty report")
        }
        else {
            logger.InfoLog(module, "set report")
        }
        result.reportString = report
    }

    override fun setListOfSources(listOfSources: String) {
        val logger = GetLogger()
        if (listOfSources == "") {
            logger.WarningLog(module, "set empty list of sources")
        }
        else {
            logger.InfoLog(module, "set list of sources")
        }
        result.listOfSources = listOfSources
    }

    override fun setAttachment(attachment: String) {
        val logger = GetLogger()
        if (attachment == "") {
            logger.WarningLog(module, "set empty attachment")
        }
        else {
            logger.InfoLog(module, "set attachment")
        }
        result.attachment = attachment
    }

    fun setFieldOfStudy(fieldOfStudy: String){
        val logger = GetLogger()
        if (fieldOfStudy == "") {
            logger.WarningLog(module, "set empty field of study")
        }
        else {
            logger.InfoLog(module, "set field of study")
        }
        result.fieldOfStudy = fieldOfStudy
    }

    fun setTypeOfResearch(typeofResearch: String){
        val logger = GetLogger()
        if (typeofResearch == "") {
            logger.WarningLog(module, "set empty type of research")
        }
        else {
            logger.InfoLog(module, "set type of research")
        }
        result.researchResults = typeofResearch
    }

    fun getResult(): ResearchReport{
        val logger = GetLogger()
        logger.InfoLog(module, "returned a science report")

        return this.result
    }

    override fun getJSONResult(): String{
        val logger = GetLogger()
        logger.InfoLog(module, "returned a jsonified science report")
        return Json.encodeToString<ResearchReport>(this.result)
    }

}