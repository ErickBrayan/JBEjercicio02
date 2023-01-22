public class Main {
    public static void main(String[] args) {
        double iva = getIva(12);
        System.out.println(iva);
    }

    static double getIva(double precio){
        return precio * 0.18;
    }

}