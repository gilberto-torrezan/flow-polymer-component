package io.github.tomasell.flow.polymer;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("my-component")
@HtmlImport("my-component.html")
public class MyComponent extends PolymerTemplate<MyComponent.Model> {

    public static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static interface Model extends TemplateModel {

        Person getPerson();

        void setPerson(Person person);

    }

    public void setPerson(Person person) {
        getModel().setPerson(person);
    }

}
