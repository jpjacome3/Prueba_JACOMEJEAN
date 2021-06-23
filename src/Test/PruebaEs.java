/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Dominio.Estudiante;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author JEAN_PIERRE
 */
public class PruebaEs {
static Scanner datos = new Scanner(System.in);
    public static void main(String[] args) {
        int nroHombres,ne;      
        System.out.println("Cuantos estudiantes desea ingresar");
        int n= datos.nextInt();
        Estudiante [] estudiantes = new Estudiante[n];
        llenaEstudiante(estudiantes);
        System.out.println("Listado de Estudiantes ordenados de mayor a menor nota");
        //llamar al metodo para ordenar
        for(int i = 0; i < estudiantes.length; i++){
            System.out.println(estudiantes[i].getNota());
        }
        nroHombres=porcentajegenero(estudiantes); 
        System.out.println("El % de hombres X encima del promedio :"+porcentajePromedio(estudiantes, nroHombres, 'm'));
        System.out.println("El % de mujeres X encima del promedio :"+porcentajePromedio(estudiantes, nroHombres, 'f'));
        ne = notaAlta(estudiantes);
        System.out.println("El estudiante con la mas alta nota es :"+estudiantes[ne].getNombre());
        
    }
    public static void llenaEstudiante(Estudiante est[]){
        String nombre;
        char sexo;
        double nota;
        for(int i=0;i<est.length;i++){
            datos.nextLine();
            System.out.println("Estudiante No "+(i+1));
            System.out.print("Nombre: ");
            nombre = datos.nextLine();
            System.out.println("Sexo: <<m>><<f>> ");
            sexo = datos.next().charAt(0);
            System.out.print("Nota : ");
            nota = datos.nextDouble();
            est[i] = new Estudiante(nombre,sexo,nota);            
        }
    }
    public  static int  porcentajegenero(Estudiante est[]){
        int cuentahombres=0,cuentamujeres=0;
        double porc;
        for(int i=0;i<est.length;i++){
            if(est[i].getSexo()=='m'){
                cuentahombres++;
            }
        }
        cuentamujeres = est.length-cuentahombres;
        System.out.println("Porcentaje hombres ="+(cuentahombres*100/est.length));
        System.out.println("Porcentaje mujeres ="+(cuentamujeres*100/est.length));
        porc = cuentahombres*100/est.length;
        return cuentahombres;
    }
    public static double porcentajePromedio(Estudiante est[],int homb,char sex){
        int muj = est.length-homb;
        int cuenta=0;
        double promedio=0,porch,porcm;
        for(int i=0;i<est.length;i++){
            promedio+=est[i].getNota();
        }
        promedio=promedio/est.length;
        
        for(int i=0;i<est.length;i++){
            if(est[i].getNota()>promedio && est[i].getSexo()==sex){
                cuenta++;
            }
        }        
        porch = homb*100/est.length;
        porcm = muj*100/est.length;
        if(sex=='m' && homb>0){
            porch = cuenta * porch/homb;
            return porch;
        }
        else if(muj>0){
            porcm = cuenta * porcm/muj;
            return porcm;
           }
        else{
            return 0;
        }
    }
    public static int notaAlta(Estudiante est[]){
        double mayor;
        int indice=0;
        mayor = est[0].getNota();
        for(int i=1;i<est.length;i++){
            if(est[i].getNota()>mayor){
                mayor = est[i].getNota();
                indice = i;
            }
        }        
        return indice;
    }
    
    public static void OrdenarN(Estudiante est[]){
        double aux= 0;
         for (int i = 0; i < est.length; i++) {
        for (int j = 1; j < (est.length - i); j++) {
            if (est[j - 1].getNota() > est[j].getNota()) {
                aux = est[j-1].getNota();
                est[j - 1].getNota() = est[j].getNota();
                est[j].getNota() = aux;
            }
        }
    } 
    }
}
    //implementar un metodo que muestre el listado de estudiantes ordenados de mayor a menor
    //imprimir ese metodo


      
