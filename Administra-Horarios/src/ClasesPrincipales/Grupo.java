package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Grupo {

	private String nombre;
	private Asignatura asignaturo;
	private HorarioGrupo horario;
	private Profesor profesor;

	public Grupo(String n, Asignatura a, HorarioGrupo h, Profesor p) {
		this.asignaturo = a;
                this.horario = h;
                this.nombre = n;
                this.profesor = p;
	}

}
