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

@XmlRootElement(name = "GenerationFilters", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class GenerationFilters {

    private String include;
    private String exclude;

    public String getInclude() {
        return include;
    }

    @XmlElement(name = "Include", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setInclude(String include) {
        this.include = include;
    }

    public String getExclude() {
        return exclude;
    }

    @XmlElement(name = "Exclude", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setExclude(String exclude) {
        this.exclude = exclude;
    }
}
