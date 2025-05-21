package org.example;

import java.util.Scanner;

public class MainDos {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo del usuario: ");
        String nombre = in.nextLine();
        System.out.println("Ingrese el ID del usuario: ");
        long id = in.nextLong();
        System.out.println("Ingrese el día de nacimiento del usuario: ");
        int dia = in.nextInt();
        System.out.println("Ingrese el mes de nacimiento del usuario: ");
        int mes = in.nextInt();
        System.out.println("Ingrese el año de nacimiento del usuario: ");
        int year = in.nextInt();
        System.out.println("Ingrese la ciudad de nacimiento del usuario: ");
        in.nextLine();
        String ciudad = in.nextLine();
        System.out.println("Ingrese el teléfono celular del usuario: ");
        long tel = in.nextLong();
        System.out.println("Ingrese el correo electrónico del usuario: ");
        in.nextLine();
        String correo = in.nextLine();
        System.out.println("A continuación ingrese los siguientes datos de la dirección del usuario: \nCalle o Carrera: ");
        String calle = in.nextLine();
        System.out.println("Nomenclatura: ");
        String nom = in.nextLine();
        System.out.println("Edificio: ");
        String edificio = in.nextLine();
        System.out.println("Apartamento: ");
        String apto = in.nextLine();
        System.out.println("Barrio: ");
        String barrio = in.nextLine();
        System.out.println("Ciudad: ");
        String ciudadRes = in.nextLine();
        System.out.println();
        Fecha fecha2=new Fecha(dia,mes,year);
        Direccion dir2=new Direccion(calle,nom,barrio,ciudadRes,edificio,apto);
        Usuario user2=new Usuario(nombre,id,fecha2,ciudad,tel,correo,dir2);
        String sUser2=user2.toString();
        System.out.println(sUser2);
    }
}
