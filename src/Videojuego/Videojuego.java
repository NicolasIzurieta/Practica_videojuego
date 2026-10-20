package Videojuego;

/*
los tipos de datos no son responsables de almacenar los valores
 */
public class Videojuego {
    public String nombre;
    public String genero;
    private String version;
    private boolean activo;

    public void setVersion(String version) {
        this.version = version;
    }
    public void setActivo(Boolean version){
        this.activo=activo;
    }

    public String getVersion() {
        return version;
    }
    public boolean getActivo(){
        return activo;
    }

    public void mostrarinformacion(){
        System.out.println("Producto: "+nombre);
        System.out.println("Precio: "+genero);
        System.out.println("Categoria: "+version);
        if (activo==true){
            System.out.println(nombre+" Esta Abierto");
        }else {
            System.out.println(nombre+" Esta cerrado");
        }
        System.out.println("-------------------------------");
    }
    public void abrir(){
        if (activo==false){
            activo=true;
            System.out.println(nombre+" Se Abrió");
        }else {
            System.out.println(nombre+" Ya esta abierto");
        }
        System.out.println("-------------------------------");
    }
    public void cerrar(){
        if (activo==true){
            activo=false;
            System.out.println(nombre+" Se cerro");
        }else {
            System.out.println(nombre+" Ya esta cerró");
        }
        System.out.println("-------------------------------");
    }
}
