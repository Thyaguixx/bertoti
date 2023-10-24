public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        Composite composite = new Composite();
        composite.addGraphic(circulo);
        composite.addGraphic(quadrado);

        composite.desenhar();
    }
}