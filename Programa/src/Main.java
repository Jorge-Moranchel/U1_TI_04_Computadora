public class Main {
    public static void main(String[] args) {

        Computadora pcgamer = new Computadora();

        pcgamer.setModelo("Legion");

        System.out.println("Computadora " + pcgamer.getModelo());
        pcgamer.encender();
        pcgamer.encender();
        pcgamer.apagar();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Computadora: " + pcgamer.getModelo());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Marca: " + pcgamer.getMarca());
        System.out.println("-------------------------------------------------------------");
        System.out.println("El estado actual es : " + pcgamer.isEncendida());

    }
}