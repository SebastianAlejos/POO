public class EjemploArreglos{
	public int suma(int[] arreglo){
		int res=0;
		for (int i=0;i<arreglo.length;i++){
			res+=arreglo[i];
		}
		return res;
	}

	public int maximo(int[] arreglo){
		int max=arreglo[0];
		for (int i=0;i<arreglo.length;i++){
			if(arreglo[i]>max){
				max=arreglo[i];
			}
		}
		return max;
	}

	public int minimo(int[] arreglo){
		int min=arreglo[0];
		for (int i=0;i<arreglo.length;i++){
			if(arreglo[i]<min){
				min=arreglo[i];
			}
		}
		return min;
	}

	public double promedio(int [] arreglo){
		int suma=this.suma(arreglo);
		double promedio=suma/arreglo.length;
		return promedio;
	}

	public void imprime(String[][] palabras){
		for (int i=0;i<palabras.length;i++){
			for(int j=0;j<palabras.length;j++){
				System.out.println(palabras[i][j]);
			}
		}
	}
}