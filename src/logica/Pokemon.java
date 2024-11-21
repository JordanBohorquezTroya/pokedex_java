
package logica;


public abstract class Pokemon {
     protected int id;
     protected String name;
     protected double weight;
     protected String sex;
     protected int season;

    public Pokemon(int id, String name, double weight, String sex, int season) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.season = season;
    }
    
     
    protected abstract void strokePlacaje();
    protected abstract void strokeAraniazo();
    protected abstract void strokeMordizco();



     
     
}
