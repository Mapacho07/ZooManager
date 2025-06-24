/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitas;

import Visitantes.Visitante;
import java.time.LocalDate;
/**
 *
 * @author duvan
 */
public class Visita {
    private Visitante Elvisitante;
    private LocalDate FechaActual;

    public Visitante getElvisitante() {
        return Elvisitante;
    }

    public LocalDate getFechaActual() {
        return FechaActual;
    }

    public Visita(Visitante Elvisitante) {
        this.Elvisitante = Elvisitante;
        this.FechaActual = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Visita{" + "Visitante=" + Elvisitante + ", FechaActual=" + FechaActual + '}';
    }
    
    
}
