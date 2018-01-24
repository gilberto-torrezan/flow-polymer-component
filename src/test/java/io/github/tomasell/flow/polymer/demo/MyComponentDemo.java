package io.github.tomasell.flow.polymer.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import io.github.tomasell.flow.polymer.MyComponent;
import io.github.tomasell.flow.polymer.MyComponent.Person;

@Route("demo")
@Theme(Lumo.class)
public class MyComponentDemo extends Div {

    public MyComponentDemo() {
        MyComponent my = new MyComponent();

        Div editingMap = new Div();
        Button createNode = new Button("Create node");
        createNode.addClickListener(event -> {
            Person p = new Person();
            p.setName("Alex");
            my.setPerson(p);
        });

        this.add(createNode, my);

    }

}
