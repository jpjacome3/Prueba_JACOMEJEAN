/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author JEAN_PIERRE
 */
public class Estudiante {
    private String nombre;
    private char sexo;
    private double nota;

 

    public Estudiante(String nombre, char sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }
    
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getNota() {
        return nota;
    }
    
    @Override
    public String toString(){
        return this.nombre+" "+this.nota+" "+this.sexo;
    }
   
}
