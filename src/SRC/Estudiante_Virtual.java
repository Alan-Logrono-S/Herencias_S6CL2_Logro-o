package SRC;

public class Estudiante_Virtual extends Estudiante {
    public String plataforma;
    public String tutor_Virtual;

    public Estudiante_Virtual(String cedula, String nombre, String direccion, String correo, String telefono,
                                 String carrera, String nivel, String plataforma, String tutor_Virtual)
    {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.plataforma = plataforma;
        this.tutor_Virtual= tutor_Virtual;
    }

    @Override
    public void Mostrar_Inf_Personal() {
        super.Mostrar_Inf_Personal();
        System.out.println("PLATAFORMA: "+ plataforma);
        System.out.println("TUTOR VIRTUAL: "+ tutor_Virtual);
    }
}
