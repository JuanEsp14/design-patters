package org.formacion.srp;

import java.util.stream.Collectors;

public class ExportadorCSV {

    private Recomendador recomendador = new Recomendador();

    public String recomendacionesCSV (Cliente cliente) {
        return recomendador.recomendaciones(cliente).stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }
}
