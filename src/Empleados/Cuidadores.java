/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;
import Animales.Animal;
/**
 *
 * @author Student
 */
public class Cuidadores extends Empleado {
    private String Especialidad;
    private String[] RegistroActividades;

    public String getEspecialidad() {
        return Especialidad;
    }

    public String[] getRegistroActividades() {
        return RegistroActividades;
    }

    
    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public void Alimentar(Animal idAnimal){
        for(int i=0; i<155;i++){
            if(RegistroActividades[i]==null){
                RegistroActividades[i]= "Se alimentó: " + idAnimal;
                break;
            }
        }
    }
    
    public void VerEstadoSalud (Animal idAnimal){
        for(int i=0; i<155;i++){
            if(RegistroActividades[i]==null){
                RegistroActividades[i]= "Se vió el estado del: " + idAnimal;
                break;
            }
        }
    }

    public Cuidadores(String Especialidad, String[] RegistroActividades, double SalarioMen, String cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono) {
        super(SalarioMen, cedula, NombreComp, FechaNacimiento, Telefono);
        this.Especialidad = Especialidad;
        this.RegistroActividades = new String[156];
    }
            
    

    @Override
    public String toString() {
        return "Cuidadores{" + "Especialidad=" + Especialidad + ", RegistroActividades=" + RegistroActividades + '}';
    }
    
    
}
