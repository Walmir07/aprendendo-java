package secao20_poo_avancado;

public class Quadrado extends Forma{
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
