/*
 * Copyright 2015 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.samples.sidebar;

import com.vaadin.ui.Notification;

import org.springframework.stereotype.Component;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.ThemeIcon;

import java.io.Serializable;

/**
 * Example operation that shows up under the Execution section in the side bar.
 *
 * @author Petter Holmström (petter@vaadin.com)
 */
@SideBarItem(sectionId = Sections.EXECUTION,
        caption = "Operation 3")
@ThemeIcon("../runo/icons/64/note.png")
@Component
@VaadinUIScope
public class ExecutionOperation3 implements Runnable, Serializable {

    private static final long serialVersionUID = 6936718554616209000L;

    @Override
    public void run() {
        Notification.show("Operation 3 executed!");
    }
}
