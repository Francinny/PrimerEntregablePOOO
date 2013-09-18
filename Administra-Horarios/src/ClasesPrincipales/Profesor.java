package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Profesor {

	private String nombre;
	private String cedula;
	private LinkedList<HorarioProfesor> horarioDisponibilidad;
	private Departamento departamento;
	private Usuario usuario;
	private LinkedList<Grupo> grupo;

	public Profesor(String nom, String ced, String d, String u, String c) {
		this.cedula = ced;
                this.nombre = nom;
                //buscar departamento y asignarlo "d"
                this.usuario = new Usuario(u, c, "Profesor");
                this.horarioDisponibilidad = new LinkedList();
                this.grupo = new LinkedList();
	}

}
