package voadores;

public class Helicoptero implements Voador {
    private int numeroHelice;

    public void setNumeroHelice(int numeroHelice) {
        this.numeroHelice = numeroHelice;
    }

    @Override
    public double voar() {
        System.out.println("Voar helicoptero");
        return 0;
    }

    @Override
    public boolean planar() {
        System.out.println("Planar helicoptero");
        return false;
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousar helicoptero");
        return false;
    }
}
