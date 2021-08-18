package com.company;

public class Sucursal {
    private int Id;
    private String Direccion;
    private int Numero;
    private String ResponsableTecnico;

    public Sucursal(String Direccion, int Numero, String ResponsableTecnico){
        this.Direccion = Direccion;
        this.Numero = Numero;
        this.ResponsableTecnico = ResponsableTecnico;
    }
}
