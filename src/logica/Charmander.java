package logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(int id, String name, double weight, String sex, int season) {
        super(id, name, weight, sex, season);
    }

 
    @Override
    protected void strokePlacaje() {
        System.out.println("Soy Charmander y este es mi ataque de placaje");
    }

    @Override
    protected void strokeAraniazo() {
        System.out.println("Soy Charmander y este es mi ataque de arañazo");

    }

    @Override
    protected void strokeMordizco() {
        System.out.println("Soy Charmander y este es mi ataque de mordisco");

    }

    @Override
    public void atacarLanzallama() {
           System.out.println("Soy Charmander y este es mi ataque lanzallama");
    }

    @Override
    public void atacarPunioFuego() {
           System.out.println("Soy Charmander y este es mi ataque Puño de fuego");
    }

}
