package logica;

public class Pokedex {

    public static void main(String[] args) {
        Picachu picachu = new Picachu(1, "Picachu", 40.0, "M", 1);
        Charmander charmander = new Charmander(2, "Charmander", 40.0, "M", 1);
        Squirtle squirtle = new Squirtle(3, "Squirtle", 40.0, "M", 1);
        Bulbasur bulbasur = new Bulbasur(4, "Bulbasur", 40.0, "M", 1);
        
        picachu.atacarImpactTrueno();
        charmander.atacarLanzallama();
        squirtle.atacarHidroBomba();
        bulbasur.atacarParalizar();

    }
}
