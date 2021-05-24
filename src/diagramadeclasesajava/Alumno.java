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

/* La clase alumno */

public class Alumno {

/*Sus atributos*/
    
private String nombre;
private int legajo;
	


/* El cnstructor genérico */

public Alumno(){
super();
}
	
	
/* El constructor con parámetros */
	
public Alumno(String nombre, int legajo){
super();
this.setNombre(nombre);
this.setLegajo(legajo);
}
	
	
	
	
/* Lo getters y los setters de los atributos */
	
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

	
}
