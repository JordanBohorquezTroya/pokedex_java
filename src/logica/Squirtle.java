package logica;

public class Squirtle extends Pokemon implements IAcuatico {

    public Squirtle(int id, String name, double weight, String sex, int season) {
        super(id, name, weight, sex, season);
    }

    @Override
    protected void strokePlacaje() {
        System.out.println("Soy Squirtle y este es mi ataque de placaje");
    }
 
    @Override
    protected void strokeAraniazo() {
        System.out.println("Soy Squirtle y este es mi ataque de arañazo");

    }

    @Override
    protected void strokeMordizco() {
        System.out.println("Soy Squirtle y este es mi ataque de mordisco");

    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle y este es mi ataque hidro bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este es mi ataque burbuja");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este es mi ataque pistola de agua");

    }
}
