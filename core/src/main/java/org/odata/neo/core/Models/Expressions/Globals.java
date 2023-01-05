package org.odata.neo.core.Models.Expressions;

import java.util.stream.Stream;

public class Globals<T> {

    public Stream<T> dataSource;

    public Stream<T> getDataSource() {
        return dataSource;
    }

    public void setDataSource(Stream<T> dataSource) {
        this.dataSource = dataSource;
    }

    
}
