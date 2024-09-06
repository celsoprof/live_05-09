package br.com.fiap.poligonos.model;

public class Trapezio extends Poligono{

    private double baseMaior;

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    @Override
    public double calcularArea() {
        double resultado = ((getBase() + getBaseMaior()) * getAltura()) / 2;
        return resultado;
    }
}
