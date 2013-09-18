package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Asignatura {

	private String nombre;
	private int numeroCreditos;
	private int horasDedicadas;
	private String categoriaCurso;

	public Asignatura(String nom, int num, int hD, String cC) {
		this.categoriaCurso = cC;
                this.horasDedicadas = hD;
                this.nombre = nom;
                this.numeroCreditos =num;
	}

}
