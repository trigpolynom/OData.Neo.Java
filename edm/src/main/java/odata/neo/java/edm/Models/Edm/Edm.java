package odata.neo.java.edm.Models.Edm;

import java.util.HashMap;
import java.util.Map;

public class Edm {

    private Map<String, EntityType> entityTypes;
    private Map<String, EntitySet> entitySets;

    public Edm() {
        entityTypes = new HashMap<>();
        entitySets = new HashMap<>();
    }

    public void addEntityType(EntityType entityType) {
        entityTypes.put(entityType.getName(), entityType);
    }

    public EntityType getEntityType(String name) {
        return entityTypes.get(name);
    }

    public void addEntitySet(EntitySet entitySet) {
        entitySets.put(entitySet.getName(), entitySet);
    }

    public EntitySet getEntitySet(String name) {
        return entitySets.get(name);
    } 
}
