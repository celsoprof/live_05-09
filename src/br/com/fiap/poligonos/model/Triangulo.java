package br.com.fiap.poligonos.model;

public class Triangulo extends Poligono{

    @Override
    public double calcularArea() {
        return getBase() * getAltura() / 2;
    }

}
