package SRC;

public class Main {
    public static void main(String[] args){
        Estudiante estudiante=new Estudiante("0987262512","Pepe","Itchimbia","pepe@gmail.com",
                "098765432","Desarrollo de Software","Tercero");
        estudiante.Mostrar_Inf_Personal();

        Estudiante_Virtual estudiante_virtual = new Estudiante_Virtual("7142536789","Mia","Puengasi","mia@gmail.com",
                "098125467","Ingenieria de Sistemas","Segundo","Virtual","Pepe Rito");
        estudiante_virtual.Mostrar_Inf_Personal();

        Estudiante_Presencial estudiante_presencial = new Estudiante_Presencial("0987231253", "Juanito", "Itchimbia","juanito@gmail.com",
        "098123534", "Economia","Cuarto",200,"Matutino");
        estudiante_presencial.Mostrar_Inf_Personal();


        Docente docente=new Docente("1724568690", "Alan", "La Tola", "alan@gmail.com",
                "098123653", "Administración",20);
        docente.Mostrar_Inf_Personal();

        Docente_Linea docente_linea=new Docente_Linea("098726183","Enrique","Recreo","enrique@gmail.com","Ciencias Administrativas",
            300,"Fijo");
        docente_linea.Mostrar_Inf_Personal();

}}

