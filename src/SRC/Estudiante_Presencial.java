package SRC;

public class Estudiante_Presencial extends Estudiante {
    public int hora_Presenciales;
    public String horario;

    public Estudiante_Presencial(String cedula, String nombre, String direccion, String correo, String telefono,
                                 String carrera, String nivel, int hora_Presenciales, String horario)
    {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.hora_Presenciales = hora_Presenciales;
        this.horario = horario;
    }

    @Override
    public void Mostrar_Inf_Personal() {
        super.Mostrar_Inf_Personal();
        System.out.println("HORARIO PRESENCIAL: "+ hora_Presenciales);
        System.out.println("HORARIO: "+ horario);
    }
}
