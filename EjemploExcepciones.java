public class EjemploExcepciones{
    public void a() throws Exception{
       b(); 
    }

    public void b()  throws Exception{
        c();
    }
    public void c() throws Exception{
        d();
    }
    public void d() throws Exception {
        e();
    }
    public void e() throws Exception{
        throw new Exception("Error en E");
    }
    public static void main(String[] args) {
            try {
                EjemploExcepciones ee= new EjemploExcepciones();
                ee.a(); 
            } catch (Exception e) {
               System.out.println("No se pudo completar la tarea");
            }
         
    }
}