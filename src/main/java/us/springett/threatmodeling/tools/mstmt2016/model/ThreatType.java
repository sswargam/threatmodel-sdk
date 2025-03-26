/*
 * This file is part of the ThreatModeling SDK.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.springett.threatmodeling.tools.mstmt2016.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ThreatType", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class ThreatType {

    private boolean isExtension;
    private String category;
    private String description;
    private GenerationFilters generationFilters;
    private String id;
    private PropertiesMetaData propertiesMetaData;
    private String shortTitle;

    public boolean isExtension() {
        return isExtension;
    }

    @XmlElement(name = "IsExtension", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setExtension(boolean extension) {
        isExtension = extension;
    }

    public String getCategory() {
        return category;
    }

    @XmlElement(name = "Category", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setDescription(String description) {
        this.description = description;
    }

    public GenerationFilters getGenerationFilters() {
        return this.generationFilters;
    }

    @XmlElement(name = "GenerationFilters", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setGenerationFilters(GenerationFilters generationFilters) {
        this.generationFilters = generationFilters;
    }

    public String getId() {
        return id;
    }

    @XmlElement(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setId(String id) {
        this.id = id;
    }

    public PropertiesMetaData getPropertiesMetaData() {
        return propertiesMetaData;
    }

    @XmlElement(name = "PropertiesMetaData", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setPropertiesMetaData(PropertiesMetaData propertiesMetaData) {
        this.propertiesMetaData = propertiesMetaData;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    @XmlElement(name = "ShortTitle", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
}
