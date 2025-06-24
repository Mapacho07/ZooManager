/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recorridos;

import Empleados.Guías;
import java.time.LocalDate;
import Visitantes.Visitante;
import Animales.Animal;
/**
 *
 * @author duvan
 */
public class Recorrido {
    private Guías Guia;
    private LocalDate Fecha;
    private Visitante visitantes[];
    private Animal Animales[];

    public Guías getGuia() {
        return Guia;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public Visitante[] getVisitantes() {
        return visitantes;
    }

    public Animal[] getAnimales() {
        return Animales;
    }

    public void Añadiranimalvist(Animal idAnimal){
        for (int i = 0; i < 50; i++){
            if (Animales[i]==null){
                Animales[i]=idAnimal;
                break;
            }
        }
    }

    public Recorrido(Guías Guia, Visitante visitantes[]) {
        this.Guia = Guia;
        this.Fecha = LocalDate.now();
        this.visitantes = visitantes;
        this.Animales = new Animal[50];
    }
    
    
    
    
}
