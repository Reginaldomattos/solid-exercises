public class Main1 {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 10);
        System.out.println("Área do Retângulo: " + retangulo.getArea());

        Forma quadrado = new Quadrado(4);
        System.out.println("Área do Quadrado: " + quadrado.getArea());
    }
}
