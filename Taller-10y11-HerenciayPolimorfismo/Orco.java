public class Orco extends Monstruo{
    private String grunyido;

    public Orco(String nombre, int sangre, String grunyido){
        super(nombre, sangre);
        this.grunyido = grunyido;
    }

    public void imprimirNombre(){
        System.out.println(super.getNombre());
    }

    public String getGrunyido(){
        return grunyido;
    }

    public void setGrunyido(String grunyido){
        this.grunyido = grunyido;
    }
}

class Monstruo{
  private int sangre;
  private String nombre;

  public Monstruo(String nombre, int sangre){
    this.sangre = sangre;
    this.nombre = nombre;
  }

  public String getNombre(){
    return this.nombre;
  }
}
