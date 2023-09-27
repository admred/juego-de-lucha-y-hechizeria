package org.juego;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Guerrero esparta = new Guerrero(
                "Esparta",
                80,
                List.of(new Espada(30),
                        new Armadura(10)));

        Guerrero gandalf = new Guerrero("Gandalf",
                90,
                List.of(new CollarDivino(5, 3),
                        new MascaraOscura(20)));


        esparta.atacar(gandalf);
        gandalf.atacar(esparta);
        esparta.atacar(gandalf);
        gandalf.atacar(esparta);
        esparta.atacar(gandalf);
        gandalf.atacar(esparta);

    }
}
