public class Strawberries extends CakeDecorator{
public Strawberries (Cake newCake) {
super(newCake);
}
public String prepareCake() {
return super.prepareCake() + " With Strawberries Top ";
}
public double cakePrice() {
return super.cakePrice()+200.0;
}
}