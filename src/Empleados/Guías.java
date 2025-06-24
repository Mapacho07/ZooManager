/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import Animales.Animal;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Guías extends Empleado {
     Scanner scan = new Scanner(System.in);
    private String[] Idiomas;
    private String[] RegistroRecorrido;
    

    public String[] getIdiomas() {
        return Idiomas;
    }

    public String[] getRegistroRecorrido() {
        return RegistroRecorrido;
    }
    
    public void setIdiomas(String[] Idiomas) {
        this.Idiomas = Idiomas;
    }
    
    public void RecorridoGuiadoVisitantes (){
        for (int i=0;i<200;i++){
            if (RegistroRecorrido[i]==null){
                RegistroRecorrido[i]= "Se le hizo recorrido a: "+scan;
                break;
            }
        }
    }
           
    public void InforAnimalVisto(Animal idAnimal){
        for(int i=0;i<200;i++){
            if (RegistroRecorrido[i]==null){
                RegistroRecorrido[i]= "Información del Animal observado: "+ idAnimal;
                break;
            }
        }
    }

    public void añadirIdiomas(String language){
        for (int i = 0; i < 15; i++) {
            if(Idiomas[i]==null){
                Idiomas[i]=language;
                break;
            }
        }
    }
    
    public Guías(String[] Idiomas, String[] RegistroRecorrido, double SalarioMen, String cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono) {
        super(SalarioMen, cedula, NombreComp, FechaNacimiento, Telefono);
        this.Idiomas = new String[25];
        this.RegistroRecorrido= new String[200];
    }

    @Override
    public String toString() {
        return "Guías{" + "Idiomas=" + Idiomas + '}';
    }
    
    
    
    
    
}
