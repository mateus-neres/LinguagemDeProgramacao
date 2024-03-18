package interfaces.figuras;
import javax.swing.plaf.PanelUI;
import java.util.Objects;
public class TrianguloEquilatero implements Figura2D {
    private Double lado;

    public TrianguloEquilatero(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrianguloEquilatero that = (TrianguloEquilatero) o;
        return Objects.equals(lado, that.lado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado);
    }

    public String getDescricao (){
        return "TRIANGULO EQUILÁTERO";
    }

    @Override
    public double calculaArea() {
        return lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double calculaPerimetro() {
        return lado * 3;
    }
}