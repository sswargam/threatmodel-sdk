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
import java.util.List;

@XmlRootElement(name = "StandardElements", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class StandardElements {

    private List<ElementType> elementTypes;

    public List<ElementType> getElementTypes() {
        return elementTypes;
    }

    @XmlElement(name = "ElementType", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setElementTypes(List<ElementType> elementTypes) {
        this.elementTypes = elementTypes;
    }
}
