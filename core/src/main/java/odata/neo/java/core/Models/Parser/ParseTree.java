package org.odata.neo.core.Models.Parser;

import java.util.ArrayList;
import java.util.List;

public class ParseTree {

    private final String label;
    private final String value;
    private final List<ParseTree> children;

    public ParseTree(String label) {
        this(label, null);
    }

    public ParseTree(String label, String value) {
        this.label = label;
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(ParseTree child) {
        this.children.add(child);
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    public List<ParseTree> getChildren() {
        return children;
    }
}
