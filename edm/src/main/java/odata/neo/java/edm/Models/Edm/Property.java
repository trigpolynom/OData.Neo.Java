package odata.neo.java.edm.Models.Edm;

public class Property {

    private String name;
    private String type;
    private boolean isPrimaryKey;

    public Property(String name, String type) {
        this(name, type, false);
    }

    public Property(String name, String type, boolean isPrimaryKey) {
        this.name = name;
        this.type = type;
        this.isPrimaryKey = isPrimaryKey;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }
    
}
