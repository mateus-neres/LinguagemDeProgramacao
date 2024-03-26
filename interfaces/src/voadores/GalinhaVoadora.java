package voadores;

public class GalinhaVoadora implements Voador {
    public void comeMilho() {
        System.out.println("Come milho galinha");
    }

    @Override
    public double voar() {
        System.out.println("Voa voa galinha");
        return 0;
    }

    @Override
    public boolean planar() {
        System.out.println("Plana galinha");
        return false;
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa galinha");
        return true;
    }

}