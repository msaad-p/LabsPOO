package org.example;

public class MainUno {
    public static void main(String[] args) {
        Fecha fecha1=new Fecha(20,3,2004);
        String sFecha1= fecha1.toString();
        System.out.println(sFecha1);
        System.out.println();

        Direccion dir1=new Direccion("Cra 64C", "#51-61", "Carlos E. Restrepo", "Medellín", "Bloque 90", "301");
        String sDir1=dir1.toString();
        System.out.println(sDir1);
        System.out.println();

        Usuario user1=new Usuario("Maria José Saad Plata", 123456, fecha1, "Barrancabermeja", 3186933020L, "msaad@unal.edu.co", dir1);
        String sUser1=user1.toString();
        System.out.println(sUser1);
    }
}