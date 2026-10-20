public class LuzInteligente {

    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;

    public LuzInteligente(String idLuz) {
        this.idLuz = idLuz;
        this.nivelBrillo = 0;
        this.encendida = false;
    }

    public void encender() {
        encendida = true;
        System.out.println("Luz " + idLuz + " encendida.");
    }

    public void apagar() {
        encendida = false;
        nivelBrillo = 0;
        System.out.println("Luz " + idLuz + " apagada.");
    }

    public void ajustarBrillo(int nuevoNivel) {
        if (!encendida) {
            System.out.println("Luz " + idLuz + ": no se puede ajustar el brillo, la luz está apagada.");
            return;
        }
        if (nuevoNivel < 0 || nuevoNivel > 100) {
            System.out.println("Luz " + idLuz + ": brillo inválido (" + nuevoNivel + "). Debe estar entre 0 y 100.");
            return;
        }
        nivelBrillo = nuevoNivel;
        System.out.println("Luz " + idLuz + ": brillo ajustado a " + nivelBrillo + "%.");
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la luz ---");
        System.out.println("ID: " + idLuz);
        System.out.println("Encendida: " + (encendida ? "Sí" : "No"));
        System.out.println("Nivel de brillo: " + nivelBrillo + "%");
        System.out.println("------------------------");
    }
}