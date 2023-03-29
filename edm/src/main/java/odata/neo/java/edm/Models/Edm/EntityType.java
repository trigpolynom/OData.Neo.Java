package odata.neo.java.edm.Models.Edm;

import java.util.ArrayList;
import java.util.List;

public class EntityType {
    
    private String name;
    private List<Property> properties;

    public EntityType(String name) {
        this.name = name;
        properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> getProperties() {
        return properties;
    }
}
