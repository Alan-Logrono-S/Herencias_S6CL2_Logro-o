package SRC;

public class Estudiante extends Persona{
    public String carrera;
    public String nivel;

    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono,
                      String carrera, String nivel){
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera=carrera;
        this.nivel=nivel;
    }

    @Override
    public void Mostrar_Inf_Personal() {
        super.Mostrar_Inf_Personal();
        System.out.println("CARRERA: "+carrera);
        System.out.println("NIVEL: "+nivel);
        System.out.println("----------------------");
    }
}
