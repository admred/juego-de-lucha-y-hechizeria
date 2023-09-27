package org.juego;

import java.util.List;

public class Guerrero {
    private String nombre;
    private List<Artefacto> artefactos;

    private int nivelDeVida;

    public Guerrero(String nombre, int nivelDeVida, List<Artefacto> artefactos) {
        this.nombre = nombre;
        this.nivelDeVida = nivelDeVida;
        this.artefactos = artefactos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivelTotalDeLucha() {

        return artefactos.stream()
                .map(Artefacto::getNivelDeLucha)
                .reduce(Integer::sum)
                .get();
    }

    public void atacar(Guerrero guerrero) {
        if (!this.sigueVivo()) {
            System.out.println(this.nombre + " esta muerto, no puede atacar");
            return;
        }
        System.out.println(this.nombre + " ataca a " + guerrero.getNombre() + " con " + this.getNivelTotalDeLucha() + " puntos de daño");
        guerrero.recibirDanio(this.getNivelTotalDeLucha());
    }

    public boolean sigueVivo() {
        return this.nivelDeVida > 0;
    }

    public void recibirDanio(int cantidad) {
        if (!this.sigueVivo()) {
            System.out.println(this.nombre + " ya estaba muerto, sadico!");
            return;
        }

        this.nivelDeVida = Integer.max(0, this.nivelDeVida - cantidad);
        System.out.println(this.nombre + " recibe " + cantidad + " puntos de daño");
        if (!this.sigueVivo()) {
            System.out.println(this.nombre + " fallece en el acto.");
        }
    }

    public int getCantidadDeArtefactos() {
        return this.artefactos.size();
    }
}
