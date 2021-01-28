class Monstruo{
  private int sangre;
  private String nombre;

  public Monstruo(String nombre, int sangre){
    this.sangre = sangre;
    this.nombre = nombre;
  }

  public void moverse(){
      System.out.println("Soy un monstruo que se mueve lento "+this.nombre);
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public int getSangre(){
    return this.sangre;
  }

  public void getNombre(int sangre){
    this.sangre = sangre;
  }
}

class Orco extends Monstruo{
    private String grunyido;

    public Orco(String nombre, int sangre, String grunyido){
        super(nombre, sangre);
        this.grunyido = grunyido;
    }

    public void imprimirNombre(){
        System.out.println(super.getNombre());
    }

    @Override
    public void moverse(){
        System.out.println("Soy un orco, estoy corriendo "+super.getNombre());
    }
}
