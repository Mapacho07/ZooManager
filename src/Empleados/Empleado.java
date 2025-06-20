/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Student
 */
public class Empleado {
    protected int cedula;
    protected String NombreComp;
    protected LocalDate FechaNacimiento;
    protected String Telefono;
    protected double SalarioMen;

    public int getCedula() {
        return cedula;
    }

    public String getNombreComp() {
        return NombreComp;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public double getSalarioMen() {
        return SalarioMen;
    }

    public void setTelefono(String Telefono) {
        if(Telefono!=null && Telefono.matches("^\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
        this.Telefono = Telefono;
        }
       
    }

    public void setSalarioMen(double SalarioMen) {
        if(SalarioMen>=300000){
            this.SalarioMen = SalarioMen;
        }
    }

    public Empleado(int cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono, double SalarioMen) {
        this.cedula = cedula;
        this.NombreComp = NombreComp;
        if(FechaNacimiento!=null && !FechaNacimiento.isAfter(LocalDate.now()) && 18 < Period.between(FechaNacimiento,LocalDate.now()).getYears()){
            this.FechaNacimiento = FechaNacimiento;
        }
        if(Telefono!=null && Telefono.matches("^\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
            this.Telefono = Telefono;
        }
        if(SalarioMen>=300000){
            this.SalarioMen = SalarioMen;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", NombreComp=" + NombreComp + ", FechaNacimiento=" + FechaNacimiento + ", Telefono=" + Telefono + ", SalarioMen=" + SalarioMen + '}';
    }
    
    
    
}
