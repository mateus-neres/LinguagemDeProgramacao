package voadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List <Voador> listaVoadores = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            switch (random.nextInt(4)){
                case 0:
                    Voador voador = new Drone("Filmagem");
                    listaVoadores.add(voador);
                    break;
                case 1:
                    Voador voador2 = new GalinhaVoadora();
                    listaVoadores.add(voador2);
                    break;
                case 2:
                    Voador voador3 = new Helicoptero();
                    listaVoadores.add(voador3);
                    break;
                case 3:
                    Voador voador4 = new Libelula("Laranja");
                    listaVoadores.add(voador4);
                    break;
            }
            for (Voador voador: listaVoadores){
                System.out.println(voador.voar()); // Chamada Polimorfica
                System.out.println("plana ?: " + voador.planar()); // Chamada Polimorfica
                System.out.println(voador.pousar()); // Chamada Polimorfica
            }
        }
    }
}
