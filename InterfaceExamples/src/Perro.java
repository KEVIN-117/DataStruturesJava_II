public class Perro implements Animals{
    private String raza;
    private String nombre;
    private String run;
    public Perro(String raza, String nombre, String run){
        this.raza = raza;
        this.nombre = nombre;
        this.run = run;
    }
    @Override
    public void comer(String n) {
        System.out.println("El perro come " + n);
    }

    @Override
    public Boolean correr(String run) {
        if (run.equals("si"))
            return true;
        else
            return false;
    }
}
