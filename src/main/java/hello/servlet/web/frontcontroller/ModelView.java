package hello.servlet.web.frontcontroller;

import lombok.Setter;

import java.util.HashMap;
import java.util.Map;



public class ModelView {

    private String ViewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.ViewName = viewName;
    }

    public String getViewName() {
        return ViewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setViewName(String viewName) {
        ViewName = viewName;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
