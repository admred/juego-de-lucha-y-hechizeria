package org.juego;

public class Espada extends Artefacto {

    public Espada(int nivelDeLucha) {
        super("Espada", nivelDeLucha);
    }

    @Override
    public int getNivelDeLucha() {
        return nivelDeLucha;
    }
}
