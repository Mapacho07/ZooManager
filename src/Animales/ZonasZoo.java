/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animales;

/**
 *
 * @author Student
 */
public enum ZonasZoo {
    GRANJA("Granja"),
    CONTACTO("Contacto"),
    ALIMENTACION("Alimentación"),
    CONSERVACIONYRESCATE("Conservación y Rescate"),
    TUNELNOCTURNO("Túnel Nocturno"),
    BIODIVERSIDADLOCAL("Biodiversidad Local");
    
    private final String zooZone;

    ZonasZoo (String zooZone){
        this.zooZone=zooZone;
    }
    
    public String getZooZone() {
        return zooZone;
    }
    

    @Override
    public String toString() {
        return "ZonasZoo{" + "zooZone=" + zooZone + '}';
    }
            
    
    
    
}
