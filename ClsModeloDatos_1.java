package com.mycompany.semana6;


public class ClsModeloDatos_1 {
    
    String nombre;
    double Venero;
    double Vfebrero;
    double Vmarzo;
    private double total;
    
    
    public ClsModeloDatos_1(){
    nombre = "";
    Venero = 0;
    Vfebrero = 0;
    Vmarzo = 0;
    total =0;
}

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getVenero() {
        return Venero;
    }

   
    public void setVenero(double Venero) {
        this.Venero = Venero;
    }

    
    public double getVfebrero() {
        return Vfebrero;
    }

    
    public void setVfebrero(double Vfebrero) {
        this.Vfebrero = Vfebrero;
    }

    
    public double getVmarzo() {
        return Vmarzo;
    }

    
    public void setVmarzo(double Vmarzo) {
        this.Vmarzo = Vmarzo;
    }

    
    public double getTotal() {
        return total;
    }

    
    public void setTotal(double total) {
        this.total = total;
    }
   
}
