package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class AulaTeorica extends Aula {

	private boolean aireAcondicionado;
	private boolean equipoMultimedia;

	public AulaTeorica(boolean aA, boolean eM, int num, String nom, String u, int c) {
		super(num, nom, u, c);
                this.aireAcondicionado = aA;
                this.equipoMultimedia = eM;
	}

}
