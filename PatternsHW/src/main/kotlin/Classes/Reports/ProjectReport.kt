package org.example.Classes.Reports

import kotlinx.serialization.Serializable

@Serializable
class ProjectReport(var executor: String = "", var scientificAdviser: String = "") : Report()