public class main {
    public static void main(String[] args) {
        String run = "no";
        Perro p1 = new Perro("Aleman", "Ruso", run);
        System.out.println(p1.correr(run));
        p1.comer("pan");

    }
}
