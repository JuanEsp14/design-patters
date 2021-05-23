package org.formacion.abstractfactory;

public class English implements IdiomaFactoryInterface{

    @Override
    public Preguntas preguntas() {
        Preguntas preguntas = new Preguntas() {
            @Override
            public String preguntaHora() {
                return "what time is it?";
            }

            @Override
            public String preguntaTiempo() {
                return "how is the weather?";
            }
        };
        return preguntas;
    }

    @Override
    public Saludos saludos() {
        Saludos saludos = new Saludos() {
            @Override
            public String buenosDias() {
                return "good morning";
            }

            @Override
            public String buenasTardes() {
                return "good afternoon";
            }
        };
        return saludos;
    }
}
