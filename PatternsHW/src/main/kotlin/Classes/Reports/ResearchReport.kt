package org.example.Classes.Reports

import kotlinx.serialization.Serializable

@Serializable
class ResearchReport(var fieldOfStudy: String = "", var researchResults: String = ""): Report() {
}