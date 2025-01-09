public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Registrando operações
        calculadora.registrarOperacao("soma", new soma());
        calculadora.registrarOperacao("subtracao", new Subtracao());
        calculadora.registrarOperacao("multiplicacao", new Multiplicacao());

        // Usando a calculadora
        System.out.println("Soma: " + calculadora.calcular("soma", 5, 3));
        System.out.println("Subtracao: " + calculadora.calcular("subtracao", 5, 3);
        System.out.println("Multiplicação: " + calculadora.calcular("multiplicacao", 5, 3));

    }
}
