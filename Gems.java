public class Gems extends CakeDecorator{
public Gems(Cake newCake) {
super(newCake);
}
public String prepareCake() {
return super.prepareCake() + " With Gems Top ";
}
public double cakePrice() {
return super.cakePrice()+150.0;
}
}