package SRC;

public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;

    public Persona (String cedula, String nombre, String direccion, String correo, String telefono){
        this.nombre = nombre;
        this.cedula=cedula;
        this.direccion=direccion;
        this.correo=correo;
        this.telefono=telefono;
    }

    public void Mostrar_Inf_Personal(){
        System.out.println("CEDULA: "+cedula);
        System.out.println("NOMBRE: "+nombre);
        System.out.println("DIRECCIÓN: "+direccion);
        System.out.println("CORREO: "+correo);
        System.out.println("TELEFONO: "+telefono);
    }
}

