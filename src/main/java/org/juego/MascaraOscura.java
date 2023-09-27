package org.juego;

public class MascaraOscura extends Artefacto {
    private int NivelDeOscuridad;

    public MascaraOscura(int nivelDeOscuridad) {
        super("Mascara de Oscuridad", nivelDeOscuridad * 2);
    }

    @Override
    public int getNivelDeLucha() {
        return this.nivelDeLucha;
    }
}
