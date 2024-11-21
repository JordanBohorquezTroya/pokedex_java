
package logica;


public class Picachu extends Pokemon implements IELlectrico{

    public Picachu(int id, String name, double weight, String sex, int season) {
        super(id, name, weight, sex, season);
    }
    
    
    
     @Override
    protected void strokePlacaje() {
        System.out.println("Soy Picachu y este es mi ataque de placaje");
    }

    @Override
    protected void strokeAraniazo() {
        System.out.println("Soy Picachu y este es mi ataque de arañazo");

    }

    @Override
    protected void strokeMordizco() {
        System.out.println("Soy Picachu y este es mi ataque de mordisco");

    }

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Soy Picachu y este es mi ataque Impac Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Picachu y este es mi ataque Puño de trueno");
        
    }
}
