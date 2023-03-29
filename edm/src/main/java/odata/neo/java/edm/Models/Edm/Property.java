package odata.neo.java.edm.Models.Edm;

public class Property {

    private String name;
    private Class<?> type;
    private boolean isPrimaryKey;

    public Property(String name, Class<?> type) {
        this(name, type, false);
    }

    public Property(String name, Class<?> type, boolean isPrimaryKey) {
        this.name = name;
        this.type = type;
        this.isPrimaryKey = isPrimaryKey;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }
    
}
