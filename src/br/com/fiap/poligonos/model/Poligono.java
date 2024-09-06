package br.com.fiap.poligonos.model;

public abstract class Poligono {

    private double altura;
    private double base;
    private double area;
    private String nomePoligono;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomePoligono() {
        return nomePoligono;
    }

    public void setNomePoligono(String nomePoligono) {
        this.nomePoligono = nomePoligono;
    }

    public abstract double calcularArea();


}
