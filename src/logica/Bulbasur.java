package logica;

public class Bulbasur extends Pokemon implements IPlanta {

    public Bulbasur(int id, String name, double weight, String sex, int season) {
        super(id, name, weight, sex, season);
    }

    @Override
    protected void strokePlacaje() {
        System.out.println("Soy Bulbasur y este es mi ataque de placaje");
    }

    @Override
    protected void strokeAraniazo() {
        System.out.println("Soy Bulbasur y este es mi ataque de arañazo");

    }

    @Override
    protected void strokeMordizco() {
        System.out.println("Soy Bulbasur y este es mi ataque de mordisco");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasur y este es mi atauqe drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasur y este es mi ataque paralizar");
    }
}
