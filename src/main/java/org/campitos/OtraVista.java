package org.campitos;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by campitos on 12/10/16.
 */
@SpringView(name = OtraVista.VIEW_NAME)
public class OtraVista extends VerticalLayout implements View {
    public static final String VIEW_NAME = "view";

    @Autowired
    private VistaSaludo vistaSaludo;

    @PostConstruct
    void init() {
        setMargin(true);
        setSpacing(true);
        addComponent(new Label("Este es un label y la segunda vista"));
        addComponent(new Label(vistaSaludo.sayHello()));

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}
