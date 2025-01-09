public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Registrando operações
        calculadora.registrarOperacao("soma", new soma());
        calculadora.registrarOperacao("subtracao", new Subtracao());
        calculadora.registrarOperacao("multiplicacao", new Multiplicacao());

    }
}
