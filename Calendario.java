/*Sebastián Alejos Acosta
A00344555
Clase Calendario
22 agosto 2019*/ 
public class Calendario{   
    public static String imprimeMes(int inicio, int numDias){
        String calendario="";
        String cal1=" D  L Ma Mi  J  V  S";
        String cal2="";
        String cal3="";    
        if(inicio==1){
            cal2=" 1 ";
            int num=2;
            int espacio=1;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                num++;
            }
        }else if(inicio==2){
            cal2="    1 ";
            int num=2;
            int espacio=2;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                num++;
            }
        }else if(inicio==3){
            cal2="       1 ";
            int num=2;
            int espacio=3;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                num++;
            }  
        }else if(inicio==4){
            cal2="          1 ";
            int num=2;
            int espacio=4;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                num++;
            }  
        }else if(inicio==5){
            cal2="             1 ";
            int num=2;
            int espacio=5;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                num++;
            }
        }else if(inicio==6){
            cal2="                1 ";
            int num=2;
            int espacio=6;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                num++;
            }
        }else if(inicio==7){
            cal2="                   1 ";
            int num=2;
            int espacio=6;
            for(int i=2;i<numDias+1;i++){
                espacio++;
                if(espacio==7){
                    cal3+="\n";
                    espacio=0;
                }
                if(i<10){
                cal3+=" "+num+" ";
                }else{
                    cal3+=num+" ";
                }
                num++;
            }
        }
        calendario=cal1+"\n"+cal2+cal3;
        return calendario;
    }
    public static void main(String[] args) {
        System.out.println(imprimeMes(1,30));
    }
}