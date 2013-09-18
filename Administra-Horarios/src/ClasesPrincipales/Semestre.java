package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Semestre {

	private int numero;
	private LinkedList<Asignatura> asignaturas;

	public Semestre(int n) {
		this.numero = n;
                this.asignaturas = new LinkedList();
	}

}
