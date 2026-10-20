public class Main {
    public static void main(String[] args) {
        LuzInteligente luz1 = new LuzInteligente("LUZ-001");
        LuzInteligente luz2 = new LuzInteligente("LUZ-002");

        // Luz 1: se enciende y se ajusta
        luz1.encender();
        luz1.ajustarBrillo(75);
        luz1.ajustarBrillo(150); // inválido, prueba la validación

        // Luz 2: se enciende y luego se apaga
        luz2.encender();
        luz2.ajustarBrillo(40);
        luz2.apagar();
        luz2.ajustarBrillo(60); // no funciona porque está apagada

        luz1.mostrarEstado();
        luz2.mostrarEstado();
    }
}