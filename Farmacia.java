import java.util.ArrayList;
class Farmacia{
    static ArrayList<String>listNomb;
    static ArrayList<Farmacia>listFmc;
    String nombre;
    String direccion;
    String telefono;
    ArrayList<Cita>citas;
    public static void gestionFarmacias(){
        if(listNomb == null)
           listNomb = new ArrayList<String>();
        String nombreFmc = Lectura.nextString("\n\nNombre farmacia: ");
        if(listNomb.contains(nombreFmc.toLowerCase().replaceAll(" ", ""))){
            System.out.println("Farmacia ya existe!!");
            crud(nombreFmc);
        }else{
            System.out.println("Farmacia nueva!!");
            listNomb.add(nombreFmc.toLowerCase().replaceAll(" ", ""));
        }
    }
    public static void crud(String drogueria){
        int sel = Lectura.nextInt("\n1. Consultar  2. Modificar  3. Borrar\n"
                    + " ==> ");
        switch(sel){
            case 1: break;
            case 2: break;
            case 3: borrar(); break;
        }
    }
    public static void borrar(){
        if(listFmc == null)
           listFmc = new ArrayList<String>();
        listFmc.remove(nf);
        System.out.flush();  
        System.out.print("escriba el nombre de la farmacia que desea borrar");
        String nf = Lectura.nextString(nombreFmc.toLowerCase().replaceAll(" ", ""));
        System.out.print("Lista de farmacias");
        for(int i=0;i++;i<1){
            System.out.print("\n"+listFmc.size(i)+"\n");
        }
    }
}