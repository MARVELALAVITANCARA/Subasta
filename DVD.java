
<<<<<<< HEAD
public class DVD extends Elemento
{
    private String director;
    public DVD(String elTitulo, String elDirector, int tiempo)
    {
        super(elTitulo, tiempo);
        director = elDirector;
    }
    public String getDirector(){
        return director;
    }
    public void print(){
        System.out.println("DVD");
        System.out.println("Titulo " + getTitulo());
        System.out.println("Director " + director);
    }
}
=======
public class Persona
{
    private String nombre;
    public Persona(String nombre)
    {
      this.nombre=nombre;
    }
    public void setPersona(String nombre){
        this.nombre=nombre;
    }
    public String getPersona(){
        return nombre;
    }
}
>>>>>>> 10e6bed9c856e4b73420caa696db7a19a82e67a7
