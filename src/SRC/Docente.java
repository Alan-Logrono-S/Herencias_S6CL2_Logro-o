package SRC;

public class Docente extends Persona{
    public String facultad;
    public int horas_asignadas;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultad, int horas_asignadas){
        super (cedula, nombre, direccion, correo, telefono);
        this.facultad=facultad;
        this.horas_asignadas=horas_asignadas;
    }

    @Override
    public void Mostrar_Inf_Personal() {
        super.Mostrar_Inf_Personal();
        System.out.println("FACULTAD: "+ facultad);
        System.out.println("HORAS ASIGNADAS: "+ horas_asignadas);
        System.out.println("----------------------");
    }
}
