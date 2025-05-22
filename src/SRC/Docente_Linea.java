package SRC;

public class Docente_Linea extends Docente {

    public String tipo_Contrato;

    public Docente_Linea(String cedula, String nombre, String direccion, String telefono, String correo, String facultad, int horas_asignadas, String tipo_Contrato){

        super (cedula, nombre, direccion, correo,telefono, facultad, horas_asignadas);
        this.tipo_Contrato=tipo_Contrato;
    }

    @Override
    public void Mostrar_Inf_Personal() {
        super.Mostrar_Inf_Personal();
        System.out.println("TIPO DE CONTRATO: "+ tipo_Contrato);
    }
}
