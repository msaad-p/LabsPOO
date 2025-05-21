package org.example;

public class Usuario {
    private String nombre;
    private long id;
    private Fecha fecha_nacimiento;
    private String ciudad_nacimiento;
    private long tel;
    private String email;
    private Direccion dir;

    public Usuario() {
    }

    public Usuario(String nombre, long id, Fecha fecha_nacimiento, String ciudad_nacimiento, long tel, String email, Direccion dir) {
        this.nombre = nombre;
        this.id = id;
        this.fecha_nacimiento = fecha_nacimiento;
        this.ciudad_nacimiento = ciudad_nacimiento;
        this.tel = tel;
        this.email = email;
        this.dir = dir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public void setCiudad_nacimiento(String ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "Nombre: " + nombre + "\n" +
                "ID: " + id + "\n" +
                "Fecha nacimiento: " + fecha_nacimiento + "\n" +
                "Ciudad nacimiento: " + ciudad_nacimiento + "\n" +
                "Tel: " + tel + "\n" +
                "Correo: " + email + "\n" +
                "Dirección: " + dir;
    }
}
