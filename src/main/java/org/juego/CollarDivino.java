package org.juego;

public class CollarDivino extends Artefacto {
    private int cantidadDePerlas;

    public CollarDivino(int cantidadDePerlas, int nivelDeLucha) {
        super("Collar Divino", nivelDeLucha);
        this.cantidadDePerlas = cantidadDePerlas;
    }

    @Override
    public int getNivelDeLucha() {
        return nivelDeLucha * this.cantidadDePerlas;
    }
}
