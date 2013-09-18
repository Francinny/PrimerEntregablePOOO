package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class AsignaturaTeorica extends Asignatura {

	private String pagina;

	public AsignaturaTeorica(String p, String nom, int num, int hD, String cC) {
            super(nom, num, hD, cC);
            this.pagina = p;
	}

}
