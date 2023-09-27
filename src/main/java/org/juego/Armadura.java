package org.juego;

public class Armadura extends Artefacto {

    private int cantidadDePiezas;

    public Armadura(int cantidadDepiezas) {
        super("Armadura", 10);
        this.cantidadDePiezas = cantidadDepiezas;
    }

    @Override
    public int getNivelDeLucha() {
        return nivelDeLucha + this.cantidadDePiezas/2;
    }
}
