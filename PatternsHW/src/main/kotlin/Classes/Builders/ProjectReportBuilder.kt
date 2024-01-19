package org.example.Classes.Builders

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.Classes.Reports.ProjectReport
import org.example.Classes.Singleton.Logger

class ProjectReportBuilder : ReportBuilder {
    private val result = ProjectReport()
    private val module = "CourseReportBuilder"
    override fun reset() {
        result.reportString = ""
        result.header = ""
        result.name = ""
        result.task = ""
        result.executor = ""
        result.scientificAdviser = ""
        result.listOfSources = ""
        result.annotation = ""
        val logger = Logger.GetLogger()
        logger.InfoLog(module, "reset")
    }

    override fun setName(name: String) {
        val logger = Logger.GetLogger()
        if (name == "") {
            logger.WarningLog(module, "set empty name")
        }
        else {
            logger.InfoLog(module, "set name")
        }
        result.name = name
    }

    override fun setTask(task: String) {
        val logger = Logger.GetLogger()
        if (task == "") {
            logger.WarningLog(module, "set empty task")
        }
        else {
            logger.InfoLog(module, "set task")
        }
        result.task = task
    }

    override fun setAnnotation(annotation: String) {
        val logger = Logger.GetLogger()
        if (annotation == "") {
            logger.WarningLog(module, "set empty annotation")
        }
        else {
            logger.InfoLog(module, "set annotation")
        }
        result.annotation = annotation
    }

    override fun setHeader(header: String) {
        val logger = Logger.GetLogger()
        if (header == "") {
            logger.WarningLog(module, "set empty header")
        }
        else {
            logger.InfoLog(module, "set header")
        }
        result.header = header
    }

    override fun setReportString(report: String) {
        val logger = Logger.GetLogger()
        if (report == "") {
            logger.WarningLog(module, "set empty report")
        }
        else {
            logger.InfoLog(module, "set report")
        }
        result.reportString = report
    }

    override fun setListOfSources(listOfSources: String) {
        val logger = Logger.GetLogger()
        if (listOfSources == "") {
            logger.WarningLog(module, "set empty list of sources")
        }
        else {
            logger.InfoLog(module, "set list of sources")
        }
        result.listOfSources = listOfSources
    }

    override fun setAttachment(attachment: String) {
        val logger = Logger.GetLogger()
        if (attachment == "") {
            logger.WarningLog(module, "set empty attachment")
        }
        else {
            logger.InfoLog(module, "set attachment")
        }
        result.attachment = attachment
    }

    fun setScientificAdviser(scientificAdviser: String){
        val logger = Logger.GetLogger()
        if (scientificAdviser == "") {
            logger.WarningLog(module, "set empty scientific adviser")
        }
        else {
            logger.InfoLog(module, "set scientific adviser")
        }
        result.scientificAdviser = scientificAdviser
    }

    fun setExecutor(executor: String){
        val logger = Logger.GetLogger()
        if (executor == "") {
            logger.WarningLog(module, "set empty executor")
        }
        else {
            logger.InfoLog(module, "set executor")
        }
        result.executor = executor
    }

    fun getResult(): ProjectReport {
        val logger = Logger.GetLogger()
        logger.InfoLog(module, "returned a science report")

        return this.result
    }

    override fun getJSONResult(): String{
        val logger = Logger.GetLogger()
        logger.InfoLog(module, "returned a jsonified science report")
        return Json.encodeToString<ProjectReport>(this.result)
    }
}