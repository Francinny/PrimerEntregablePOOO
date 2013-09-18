package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Usuario {

	private String usuario;
	private String clave;
	private String tipo;

	public Usuario(String u, String c, String t) {
		this.clave = c;
                this.tipo = t;
                this.usuario = u;
	}

}
