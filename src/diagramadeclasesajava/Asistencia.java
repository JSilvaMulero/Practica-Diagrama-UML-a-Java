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

/*La clase asistencia*/

public class Asistencia {
    
/*Los atributos*/
    
private Date fecha;
private ArrayList<Alumno> alumnos;
	
	
	
/* El constructor genérico */

public Asistencia(){
super();




/*Instanciamos a  una colección vacía y le asignamos el atributo*/
	
this.setAlumnos(new ArrayList<Alumno>());
}
	
	
/* El constructor con parámetros */

public Asistencia(Date fecha){
super();
this.setFecha(fecha);


/*Instanciamos una colección vacía y le asignamos el atributo*/
		
this.setAlumnos(new ArrayList<Alumno>());
}

	
	
	
	
	
/* Agrega un nuevo alumno a la colección de alumnos con el metodo add de ArrayList para agregar el objeto "alumno" de tipo "Alumno" */

public void agregarAlumno(Alumno alumno){
this.getAlumnos().add(alumno);
}
	
	
	
	
/* Eliminamos una nueva carrera universitaria a la colección de carreras con el método "remove" de ArrayList para ubicar y eliminar el objeto "carrera" de tipo "Carrera" */

public void eliminarAlumno(Alumno alumno){
this.getAlumnos().remove(alumno);
}
	
	
	
	
/* Nos devuelve la cantidad de alumnos en la colección con el metodo size*/

public int contarAlumnos(){
return this.getAlumnos().size();
}
	
	
	
/* Los getters y los setters de los atributos */

public Date getFecha() {
return fecha;
}


public void setFecha(Date fecha) {
this.fecha = fecha;
}


public ArrayList<Alumno> getAlumnos() {
return alumnos;
}


public void setAlumnos(ArrayList<Alumno> alumnos) {
this.alumnos = alumnos;
}
	
		
}
