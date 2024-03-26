package voadores;

public class Libelula implements Voador {
    private String cor;

    public Libelula(String cor) {
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public double voar() {
        System.out.println("Voa voa libelula " + getCor());
        return 0;
    }

    @Override
    public boolean planar() {
        System.out.println("Plana libelula " + getCor());
        return false;
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa libelula " + getCor());
        return true;
    }
}