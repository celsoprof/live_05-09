package br.com.fiap.poligonos.model;

public class Retangulo extends Poligono{
    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
}
