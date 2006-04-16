/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
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
package org.apache.struts.action2.views.jsp.ui;

import org.apache.struts.action2.components.UIBean;
import org.apache.struts.action2.views.jsp.ComponentTagSupport;


/**
 * Abstract base class for all UI tags.
 *
 */
public abstract class AbstractUITag extends ComponentTagSupport {
    protected String cssClass;
    protected String cssStyle;
    protected String title;
    protected String disabled;
    protected String label;
    protected String labelPosition;
    protected String requiredposition;
    protected String name;
    protected String required;
    protected String tabindex;
    protected String value;
    protected String template;
    protected String theme;
    protected String onclick;
    protected String ondblclick;
    protected String onmousedown;
    protected String onmouseup;
    protected String onmouseover;
    protected String onmousemove;
    protected String onmouseout;
    protected String onfocus;
    protected String onblur;
    protected String onkeypress;
    protected String onkeydown;
    protected String onkeyup;
    protected String onselect;
    protected String onchange;
    
    // tooltip attributes
    protected String tooltip;
    protected String tooltipConfig;


    protected void populateParams() {
        super.populateParams();

        UIBean uiBean = (UIBean) component;
        uiBean.setCssClass(cssClass);
        uiBean.setCssClass(cssClass);
        uiBean.setCssStyle(cssStyle);
        uiBean.setTitle(title);
        uiBean.setDisabled(disabled);
        uiBean.setLabel(label);
        uiBean.setLabelposition(labelPosition);
        uiBean.setRequiredposition(requiredposition);
        uiBean.setName(name);
        uiBean.setRequired(required);
        uiBean.setTabindex(tabindex);
        uiBean.setValue(value);
        uiBean.setTemplate(template);
        uiBean.setTheme(theme);
        uiBean.setOnclick(onclick);
        uiBean.setOndblclick(ondblclick);
        uiBean.setOnmousedown(onmousedown);
        uiBean.setOnmouseup(onmouseup);
        uiBean.setOnmouseover(onmouseover);
        uiBean.setOnmousemove(onmousemove);
        uiBean.setOnmouseout(onmouseout);
        uiBean.setOnfocus(onfocus);
        uiBean.setOnblur(onblur);
        uiBean.setOnkeypress(onkeypress);
        uiBean.setOnkeydown(onkeydown);
        uiBean.setOnkeyup(onkeyup);
        uiBean.setOnselect(onselect);
        uiBean.setOnchange(onchange);
        uiBean.setTooltip(tooltip);
        uiBean.setTooltipConfig(tooltipConfig);
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @deprecated please use {@link #setLabelposition} instead
     */
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    public void setLabelposition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    public void setRequiredposition(String requiredPosition) {
        this.requiredposition = requiredPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    public void setOnfocus(String onfocus) {
        this.onfocus = onfocus;
    }

    public void setOnblur(String onblur) {
        this.onblur = onblur;
    }

    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    public void setOnselect(String onselect) {
        this.onselect = onselect;
    }

    public void setOnchange(String onchange) {
        this.onchange = onchange;
    }
    
    public void setTooltip(String tooltip) {
    	this.tooltip = tooltip;
    }
    
    public void setTooltipConfig(String tooltipConfig) {
    	this.tooltipConfig = tooltipConfig;
    }
}
