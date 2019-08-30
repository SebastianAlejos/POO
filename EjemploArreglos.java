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

	public void imprime(String[][] palabras){
		for (int i=0;i<palabras.length;i++){
			for(int j=0;j<palabras.length;j++){
				System.out.println(palabras[i][j]);
			}
		}
	}

	public static void main(String[] args){
		EjemploArreglos ea=new EjemploArreglos();
		int [] valores={-4,-16,-8,-144,-2};
		int valor= ea.suma(valores);
		System.out.println(valor);
		int maximo= ea.maximo(valores);
		System.out.println(maximo);
		for(int i=0;i<args.length;i++){
			System.out.println("Args posición "+ i + ": "+ args[i]);
		}
		String[][] nombres={{}{}}
	}
}