package application;

import entities.RedeSocial;

public class Main {
    public static void main(String[] args) {
        RedeSocial redesocial = new RedeSocial();

        redesocial.adicionarUsuario("Mateus Neres");
        redesocial.postar("Mateus Neres", "Java é vida!");
        redesocial.adicionarUsuario("Kauã Brito");
        redesocial.postar("Kauã Brito", "Java é massa!");
        redesocial.seguir("Mateus Neres", "Kauã Brito");
        System.out.println(redesocial.lerMural("Kauã Brito"));


    }
}
