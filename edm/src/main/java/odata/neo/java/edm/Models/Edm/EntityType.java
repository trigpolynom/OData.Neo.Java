package odata.neo.java.edm.Models.Edm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityType {

    private String name;
    private List<Property> properties;
    private Map<String, EntityType> subEntityTypes;

    public EntityType(String name) {
        this.name = name;
        properties = new ArrayList<>();
        subEntityTypes = new HashMap<>();
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

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public void addSubEntityType(String name, EntityType entityType) {
        subEntityTypes.put(name, entityType);
    }

    public Map<String, EntityType> getSubEntityTypes() {
        return subEntityTypes;
    }

    public void setSubEntityTypes(Map<String, EntityType> subEntityTypes) {
        this.subEntityTypes = subEntityTypes;
    }
}
