package org.example;

public class Agenda {
    private Usuario[] registro;
    private int no_reg;

    public Agenda(int capacity) {
        this.registro=new Usuario[capacity];
        this.no_reg=0;
    }

    public boolean agregar(Usuario u) {
        if (buscar(u.getId()) != -1) {
            return false;
        }
        if (no_reg < registro.length) {
            registro[no_reg] = u;
            no_reg++;
            return true;
        } else {
            return false;
        }
    }

    public int buscar(long id) {
        for (int i = 0; i < no_reg; i++) {
            if (registro[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean eliminar(long id) {
        int posicionAEliminar = buscar(id);
        if (posicionAEliminar == -1) {
            return false;
        } else {
            for (int i = posicionAEliminar; i < no_reg - 1; i++) {
                registro[i] = registro[i + 1];
            }
            registro[no_reg - 1] = null;
            no_reg--;
            return true;
        }
    }

    public void mostrar() {
        if (no_reg == 0) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.println("--- Usuarios registrados en la Agenda ---");
        for (int i = 0; i < no_reg; i++) {
            System.out.println("Nombre: " + registro[i].getNombre());
            System.out.println("ID: " + registro[i].getId());
        }
    }

    public void mostrarUsuario(long id) {
        int posicion = buscar(id);

        if (posicion != -1) {
            Usuario user = registro[posicion];
            System.out.println("--- Información del Usuario ---");
            String userprint = user.toString();
            System.out.println(userprint);
        } else {
            System.out.println("El usuario con ID " + id + " no se encontró en la agenda.");
        }
    }
}
