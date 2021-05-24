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

/*Importamos ArrayList y Date*/
import java.util.ArrayList;
import java.util.Date;

/* La clase Materia */

public class Materia {


/*Los atributos*/
    
private String nombre;
private Profesor titular;
private ArrayList<Alumno> alumnos;
private ArrayList<Asistencia> asistencias;
	
	
/* El constructor genérico */

public Materia(){
super();


/*Instancias*/

this.setAlumnos(new ArrayList<Alumno>());
this.setAsistencias(new ArrayList<Asistencia>());
}
	
	
/* El constructor con parámetros */

public Materia(String nombre){
super();

this.setNombre(nombre);
		

/*Instancias*/

this.setAlumnos(new ArrayList<Alumno>());
this.setAsistencias(new ArrayList<Asistencia>());
}
	
	

/* Constructor con parámetros */

public Materia(String nombre, Profesor titular){
super();

this.setNombre(nombre);
this.setTitular(titular);
	

/*Instancias*/

this.setAlumnos(new ArrayList<Alumno>());
this.setAsistencias(new ArrayList<Asistencia>());
}
	
	
	
	
/* Calcula los alumnos inscriptos en la materia*/

public int calcularInscriptos(){
return this.getAlumnos().size();
}
	
	
	
	
/* Calcular el porcentaje de asistencia y devolvemos un enteror, entre 0 y 1*/

public double calcularAsistencia(Date fecha){

    for (Asistencia asist : this.getAsistencias()){
    if ((asist.getFecha()).compareTo(fecha) == 0)
    return (double)asist.contarAlumnos() / (double)this.calcularInscriptos();
    }

    return 0;
    }
	
	
	
/* Agregamos un nuevo alumno a la colección de alumnos  con el metodo add de Arraylist*/

public void agregarAlumno(Alumno alumno){
this.getAlumnos().add(alumno);
}
	
	
	
	
/* Eliminamos una nueva carrera universitaria a la colección de carreras con el metodo  "remove" de ArrayList*/

public void eliminarAlumno(Alumno alumno){
this.getAlumnos().remove(alumno);
}
	
	
	
	
/* Agregamos una nueva asistencia a la colección de asistencias con el método "add" de ArrayList */

public void agregarAsistencia(Asistencia asistencia){
this.getAsistencias().add(asistencia);
}
	
	
	
	
/* Eliminamos una nueva carrera universitaria a la colección de carreras con el el método "remove" de ArrayList*/

public void eliminarAsistencia(Asistencia asistencia){
this.getAsistencias().remove(asistencia);
}
	
	
	
	
	
	
	
	
/* Getters y Setters de los atributos */
	
public String getNombre() {
return nombre;
}
	
	
public void setNombre(String nombre) {
this.nombre = nombre;
}
	
	
public Profesor getTitular() {
return titular;
}
	
	
public void setTitular(Profesor titular) {
this.titular = titular;
}
	
	
public ArrayList<Alumno> getAlumnos() {
return alumnos;
}
	
	
public void setAlumnos(ArrayList<Alumno> alumno) {
this.alumnos = alumno;
}
	
	
public ArrayList<Asistencia> getAsistencias() {
return asistencias;
}
	
	
public void setAsistencias(ArrayList<Asistencia> asistencia) {
this.asistencias = asistencia;
}
		
}
