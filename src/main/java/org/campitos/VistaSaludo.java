package org.campitos;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class VistaSaludo {
    public String sayHello() {
        return "Hello from a view scoped bean " + "Beab jijo del main";
    }
}