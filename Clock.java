public class Clock{
	//Proximos atributos para el metodo
	private int hr,
		         min,
				sec;
	private String cd;

	//El constructor crea el objeto e inicializa los atributos
	//Constructor Default
	public Clock(){
	
		//this con parentesis y parametros llama al constructor que recibe los parametros
		this(12,0,0,"Guadalajara");
	}
	
	//Constructor con parametros
	//Los parametros son variables locales
	public Clock(int hr, int min, int sec,String cd){
		//Al atributo horas del objeto le asigna el valor del parametro (variable local) de 		las horas
		//objeto.atributo
		this.setTime(hr,min,sec);
		this.cd=cd;
	}

	public void setTime(int hr, int min, int sec){
		//IFS que validan que los datos ingresados esten limitados.
		//Siempre se pone al principio del if lo que hace el codigo y luego en el else el 		caso en el que sea error
		if(hr>=0 && hr<24){
			this.hr = hr;
		}else{
			this.hr = 12;
		}		

		if(min>=0 && min<60){
			this.min = min;
		}else{
			this.min = 0;
		}

		if(sec>=0 && sec<24){
			this.sec = sec;
		}else{
			this.sec = 0;
		}
	}

	//Metodos get
	public int getHours(){
		//This siempre hace referencia al atributo del objeto actual
		return this.hr;
	}

	public int getMinutes(){
		return this.min;
	}

	public int getSeconds(){
		return this.sec;
	}

	public void printTime(){
		System.out.println(this.cd+ " "+this.hr + ":" + this.min + ":" + this.sec);
	}

	public void incrementHours(){
		this.hr=++this.hr%24;
	}

	public void incrementMinutes(){
		if(this.min < 59){
			this.hr++;
		} else {
			this.min = 0;
			incrementHours();
		}
	}

	public void incrementSeconds(){
		if(this.sec < 59){
			this.sec++;
		} else {
			this.sec = 0;
			incrementMinutes();
		}
	}

	public boolean equals(Clock reloj){
		return this.hr == reloj.hr && this.min == reloj.min && this.sec == reloj.sec;
		
	}

	public void makeCopy(Clock reloj){
		this.hr = reloj.hr;
		this.min = reloj.min;
		this.sec = reloj.sec;

	}

	public void getCopy(){
		new Clock(this.hr,this.min,this.sec,this.cd);
	}

	public String toString(){
		return this.cd+" "+this.hr+":"+this.min+":"+this.sec;
	}
}