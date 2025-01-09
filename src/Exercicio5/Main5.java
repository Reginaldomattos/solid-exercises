public class Main5 {
    public static void main5(String[] args) {

        DispositivoEntrada teclado = new Teclado();
        Computador computadorComTeclado = new Computador(teclado);
        computadorComTeclado.usarDispositivo();

        DispositivoEntrada mouse = new Mouse();
        Computador computadorComMouse = new Computador(mouse);
        computadorComMouse.usarDispositivo();
    }
}
