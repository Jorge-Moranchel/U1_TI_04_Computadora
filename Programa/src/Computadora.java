public class Computadora {

    private String marca = "lenovo";
    private String modelo;
    private boolean encendida;

    public Computadora() {
        this.modelo = modelo;
        this.encendida = false;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean isEncendida() {
        return encendida;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendiendo...");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagando...");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }
}