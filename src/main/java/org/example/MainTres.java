package org.example;

public class MainTres {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);
        Fecha fecha1 = new Fecha(22, 03, 1992);
        Direccion dir1 = new Direccion("Avenida Siempre Viva", "742", "Springfield", "Ciudad Capital", "Casa Amarilla", "1A");
        Usuario user1 = new Usuario("Homero J. Simpson", 12345678901L, fecha1, "Springfield", 1122334455L, "homer.simpson@outlook.com", dir1);

        Fecha fecha2 = new Fecha(01, 01, 1980);
        Direccion dir2 = new Direccion("Calle Falsa", "123", "Pueblo Paleta", "Kanto", "Laboratorio", "001");
        Usuario user2 = new Usuario("Ash Ketchum", 98765432109L, fecha2, "Pueblo Paleta", 9988776655L, "ash.ketchum@gmail.com", dir2);

        Fecha fecha3 = new Fecha(30, 11, 1995);
        Direccion dir3 = new Direccion("Boulevard de los Sueños Rotos", "99", "Oaxaca", "Oaxaca", "Dream Palace", "303");
        Usuario user3 = new Usuario("María Fernández", 56473829101L, fecha3, "Oaxaca", 5544332211L, "maria.fernandez@yahoo.com", dir3);

        Fecha fecha4 = new Fecha(05, 07, 1988);
        Direccion dir4 = new Direccion("Carrera 10", "20-15", "Centro", "Medellín", "Torre Central", "801");
        Usuario user4 = new Usuario("Juan David Pérez", 23456789012L, fecha4, "Medellín", 6677889900L, "juan.perez@example.com", dir4);

        Fecha fecha5 = new Fecha(10, 02, 2000);
        Direccion dir5 = new Direccion("Vía Láctea", "1", "Espacio Exterior", "Universo", "Estación Espacial", "Alpha");
        Usuario user5 = new Usuario("Zoe Galáctica", 87654321098L, fecha5, "Desconocido", 1029384756L, "zoe.galactic@galaxy.net", dir5);

        agenda.agregar(user1);
        agenda.agregar(user2);
        agenda.agregar(user3);
        agenda.agregar(user4);
        agenda.agregar(user5);

        agenda.mostrar();

        agenda.mostrarUsuario(user1.getId());
        agenda.mostrarUsuario(user5.getId());
    }
}
