package odata.neo.java.edm.Models.Edm;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntitySet {
    
    private String name;
    private EntityType entityType;
    private Set<Object> entities;

    public EntitySet(String name, EntityType entityType) {
        this.name = name;
        this.entityType = entityType;
        this.entities = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void addEntity(Object entity) {
        entities.add(entity);
    }

    public Set<Object> getEntities() {
        return entities;
    } 
}
