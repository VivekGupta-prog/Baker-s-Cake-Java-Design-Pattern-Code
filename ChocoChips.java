public class ChocoChips extends CakeDecorator{
public ChocoChips(Cake newCake) {
super(newCake);
}
public String prepareCake() {
return super.prepareCake() + " With ChocoChips Top ";
}
public double cakePrice() {
return super.cakePrice()+250.0;
}
}