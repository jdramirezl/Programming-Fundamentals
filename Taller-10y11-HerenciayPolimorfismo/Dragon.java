public class Dragon extends Monstruo {
  private String escamas;
    public Dragon(String nombre, int sangre, String escamas){
      super(nombre, sangre);
      this.escamas = escamas;
    }

    public void imprimirNombre(){
      System.out.println(super.getNombre());
    }

    @Override
    public void moverse(){
      System.out.println("Soy un dragon, estoy volando "+super.getNombre());
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

class Juego{
  private Monstruo monstruos[];
  public Juego(){
    this.monstruos = new Monstruo[4];
    monstruos[0] = new Orco("Garnag",10,"grrr");
    monstruos[1] = new Dragon("Brenton",20,"metal");
    monstruos[2] = new Orco("Rogthun",5,"purr");
    monstruos[3] = new Dragon("Shenlong",40,"cuero");
  }

  public void moverMonstruos(){
    for(Monstruo a: monstruos){
      a.moverse();
    }
  }
}

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
