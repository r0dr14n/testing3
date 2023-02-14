package funciones;

public class Utilidades {

	public static final int HORASJORNADA = 38;
	
	/**
	 * Metodo de la clase que devulve la representación textual de la nota.
	 * pasada como parametro.
	 * @param nota double con la nota a comprobar.
	 * @return Una cadena de tipo String con el teto resultante (Suspenso,
	 * Bien, Notable, Sobresaliente, Matricula).
	 * @throws ArithmeticException cuando la nota no está entre 0 y 10.
	 */
	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
	
	
	/**
	 * Metodo de la clase que calcula el salario del empleado.
	 * @param numHoras (entero), precioHoras (doble), precioExtras (doble).
	 * @return Un double con el salario.
	 */
	public double calculaSalario(int numHoras, double precioHoras, double precioExtras) {
		int extras=0;
		int horas=numHoras;
		if (numHoras>HORASJORNADA) {
			extras = HORASJORNADA-numHoras;
			horas = HORASJORNADA;
		}
		return horas*precioHoras+extras*precioExtras;		
	}
	
	/**
	 * Metodo de la clase que cuenta los divisores entre 2.
	 * @param num int.
	 * @return Un int con los divisores.
	 */
	public int cuentaDivisores(int num) {
		int cuenta=0;
		
		for (int i = 0; i < num; i++) {
			if (num%2==0) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	/**
	 * Metodo de la clase que devuelve el menor valor del vector.
	 * pasado como parametro.
	 * @param v int.
	 * @return Un double con el menor valor del vector.
	 */
	public double devuelveMenor(int v[]) {
		double menor=v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] < menor) {
				menor=v[i];
			}
		}
		return menor;
	}
	
	
	/**
	 * Metodo de la clase que ordena los numeros de un vector de menor a mayor.
	 * @param v int.
	 * @return un vector con los valores ordenados.
	 */
	public int [] burbuja(int[] v) {
      int auxiliar;
      int[] ordenado;
      for(int i = 1; i < v.length; i++)
      {
        for(int j = 0;j < v.length-i;j++)
        {
          if(v[j] > v[j+1])
          {
            auxiliar = v[j];
            v[j] = v[j+1];
            v[j+1] = auxiliar;
          }   
        }
      }
      ordenado = v;
      return ordenado;
    }
}