package ExpresionesRegulares;

public class Example_1 {
    public static void main(String[] args) {
        String[] palabras = {"kevin117", "(157[]Aleis)", "Ro123driguez"};
        for (int i = 0; i < palabras.length; i++) {
            if (String.valueOf(palabras[i]).contains("\\p{Lower}\\p{Upper}\\d")){
                System.out.println(palabras[i]);
            }
        }
    }
}
