package br.com.fiap.poligonos;


import br.com.fiap.poligonos.model.Retangulo;
import br.com.fiap.poligonos.model.Trapezio;
import br.com.fiap.poligonos.model.Triangulo;

public class Principal {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo();
        t1.setAltura(4);
        t1.setBase(6);
        t1.setNomePoligono("TRIÂNGULO");
        double  areaTriangulo = t1.calcularArea();
        System.out.printf("A área do %s é %s\n\n", t1.getNomePoligono(), areaTriangulo);

        Retangulo r1 = new Retangulo();
        r1.setAltura(4);
        r1.setBase(7);
        r1.setNomePoligono("RETÂNGULO");
        double areaRetangulo = r1.calcularArea();
        System.out.printf("A área do %s é %s\n\n", r1.getNomePoligono(), areaRetangulo);

        Trapezio trapezio = new Trapezio();
        trapezio.setBaseMaior(8);
        trapezio.setBase(5);
        trapezio.setAltura(5);
        trapezio.setNomePoligono("TRAPÉZIO");
        double areaTrapezio = trapezio.calcularArea();
        System.out.printf("A área do %s é %s\n\n", trapezio.getNomePoligono(), areaTrapezio);

    }
}
