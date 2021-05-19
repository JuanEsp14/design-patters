package org.formacion.ocp;

import java.util.Comparator;

public class OrdenInverso extends GeneradorPrimos {

    @Override
    protected Comparator<Integer> getOrder(){
        return (a, b) -> a < b ? 1 : -1;
    }
}
