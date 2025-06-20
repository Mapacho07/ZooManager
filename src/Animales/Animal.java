/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import java.time.LocalDate;
/**
 *
 * @author Student
 */
public class Animal {
    private String idAnimal;
    private String NombreAnimal;
    private String Especie;
    private LocalDate FechaNacimiento;
    private ZonasZoo zooZone;

    public String getIdAnimal() {
        return idAnimal;
    }

    public String getNombreAnimal() {
        return NombreAnimal;
    }

    public String getEspecie() {
        return Especie;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public ZonasZoo getZooZone() {
        return zooZone;
    }

    public void setZooZone(ZonasZoo zooZone) {
        this.zooZone = zooZone;
    }

    public Animal(String idAnimal, String NombreAnimal, String Especie,LocalDate FechaNacimiento) {
        if( idAnimal!=null && idAnimal.matches("^\\w{1}-[\\d]{4}$")){
            this.idAnimal = idAnimal;
        }
        this.NombreAnimal = NombreAnimal;
        this.Especie = Especie;
        if(FechaNacimiento!=null && !FechaNacimiento.isAfter(LocalDate.now())){
            this.FechaNacimiento = FechaNacimiento;
        }
        this.zooZone = ZonasZoo.CONSERVACIONYRESCATE;
    }

    
    
            
          
}
