package Videojuego;

import Videojuego.Videojuego;

public class Mainvideojuego {

    public static void main(String[] args) {
        Videojuego v1=new Videojuego();
        Videojuego v2=new Videojuego();
        Videojuego v3=new Videojuego();
        v1.nombre="Brake Tales";
        v1.genero="RPG";
        v1.getVersion();
        v1.setVersion("2.5.1");
        v1.getActivo();
        v1.setActivo(true);
        v2.nombre="Destroyland";
        v2.genero="Shooter";
        v2.getVersion();
        v2.setVersion("0.9.9");
        v2.getActivo();
        v2.setActivo(false);
        v3.genero="Walking simulator";
        v3.nombre="weird walk";
        v3.getVersion();
        v3.setVersion("1.0.0");
        v3.getActivo();
        v3.setActivo(false);
        v1.mostrarinformacion();
        v2.mostrarinformacion();
        v2.abrir();
        v3.mostrarinformacion();
        v3.cerrar();
    }
}