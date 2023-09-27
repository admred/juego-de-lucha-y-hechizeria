package org.juego;

abstract public class Artefacto {
    protected int nivelDeLucha;
    private String nombre;


    public Artefacto(String nombre, int nivelDeLucha) {
        this.nombre = nombre;
        this.nivelDeLucha = nivelDeLucha;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivelDeLucha() {
        return nivelDeLucha;
    }
}
