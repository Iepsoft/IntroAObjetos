package com.company;

public class Usuario {
    private int rol;
    private int id;
    private String NombredeUsuario;
    public String Email;
    private String Password;
    public String Nombre;
    public String Domicilio;
    public int DNI;
    public String FechadeNacimiento;

    public Usuario(int rol, String NombredeUsuario, String Email, String Password, String Nombre, String Domicilio, int DNI, String FechadeNacimiento){
        this.rol = rol;
        this.NombredeUsuario = NombredeUsuario;
        this.Email = Email;
        this.Password = Password;
        this.Nombre = Nombre;
        this.FechadeNacimiento = FechadeNacimiento;
    }

    public int ObtenerRol(){
        return this.rol;
    }


}
