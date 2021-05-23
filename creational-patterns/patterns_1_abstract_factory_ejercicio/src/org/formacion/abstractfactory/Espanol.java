package org.formacion.abstractfactory;

public class Espanol implements IdiomaFactoryInterface{

    @Override
    public Preguntas preguntas() {
        Preguntas preguntas = new Preguntas() {
            @Override
            public String preguntaHora() {
                return "¿qué hora es?";
            }

            @Override
            public String preguntaTiempo() {
                return "¿qué tiempo hace?";
            }
        };
        return preguntas;
    }

    @Override
    public Saludos saludos() {
        Saludos saludos = new Saludos() {
            @Override
            public String buenosDias() {
                return "buenos días";
            }

            @Override
            public String buenasTardes() {
                return "buenas tardes";
            }
        };
        return saludos;
    }
}
