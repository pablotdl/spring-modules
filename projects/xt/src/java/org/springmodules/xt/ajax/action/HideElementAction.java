/*
 * Copyright 2006 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springmodules.xt.ajax.action;

/**
 * Taconite based ajax action for hiding an HTML element by its id.<br>
 * This action uses Javascript code from the Prototype library.
 *
 * @author Sergio Bossa
 */
public class HideElementAction extends AbstractExecuteJavascriptAction {
    
    private String elementId;
    
    /**
     * Action constructor.
     * @param elementId The id of the element to hide in the HTML page.
     */
    public HideElementAction(String elementId) {
        this.elementId = elementId;
    }
    
    protected String getJavascript() {
        return new StringBuilder("Element.hide('").append(elementId).append("');").toString();
    }
}