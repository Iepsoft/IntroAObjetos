package com.company;

public class Paciente {
    private int Id;
    private int DNI;
    private String Nombre;
    private String Domicilio;
    private String Email;
    private String Sexo;
    private int Edad;

    public Paciente(int DNI, String Nombre, String Domicilio, String Email, String Sexo, int Edad){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Email = Email;
        this.Sexo = Sexo;
        this.Edad = Edad;
    }
}
