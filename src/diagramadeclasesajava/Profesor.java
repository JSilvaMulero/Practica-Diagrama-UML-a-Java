/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclasesajava;

/**
 *
 * @author Alumno_T
 */


/* La clase profesor */

public class Profesor {
	
/*Sus atributos*/
    
private String nombre;
private int legajo;
private double basico;
private int antiguedad;
	
	

/* El constructor genérico */
public Profesor(){
super();
}
	
	
/* El constructor con parámetros */
public Profesor(String nombre, int legajo, double basico, int antiguedad){

super();

this.setNombre(nombre);
this.setLegajo(legajo);
this.setBasico(basico);
this.setAntiguedad(antiguedad);
}
	
	
/* Calcular el sueldo, en dicho suledo, cada 5 años de antigüedad se suma un 10% */

public double calcularSueldo(){
double sueldoIncrementado = this.getBasico();


int cantidadDeAumentos = (int) (this.getAntiguedad() / 5);


//Agregamos un 10% por cada 5 años de antigüedad

for (int x = 1; x <= cantidadDeAumentos; x++){
sueldoIncrementado += (this.getBasico() * 0.10);
}
return sueldoIncrementado;
}
	
	
	
	
/* Los getters y los setters de los atributos */
	
public String getNombre() {
return nombre;
}
	
	
public void setNombre(String nombre) {
this.nombre = nombre;
}
	
	
public int getLegajo() {
return legajo;
}
	
	
public void setLegajo(int legajo) {
this.legajo = legajo;
}
	
	
public double getBasico() {
return basico;
}
	
	
public void setBasico(double basico) {
this.basico = basico;
}


public double getAntiguedad() {
return antiguedad;
}


public void setAntiguedad(int antiguedad) {
this.antiguedad = antiguedad;
}
	
}