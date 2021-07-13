import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class BakeryCustomer{
    private static int choice1,choice2;
    public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("=======Cake Base=======");
System.out.println(" 1. Red Velvet Cake \n");
System.out.println(" 2. Chocolate Cake \n");
System.out.println(" 3. Exit \n");
choice1 = Integer.parseInt(br.readLine());

switch(choice1) {
case 1: {
redVelvetCake c1=new redVelvetCake();
c1.templateMethod();
} break;
case 2: {
chocolateCake c2=new chocolateCake();
c2.templateMethod(); 
} break;
default: {
System.out.println("Variety not present");
} return;
}

System.out.println("=======Decorations=======");
System.out.println(" 1. Gems \n");
System.out.println(" 2. Choco Chips \n");
System.out.println(" 3. Strawberries \n");
System.out.println(" 4. Exit \n");
choice2 = Integer.parseInt(br.readLine());

switch(choice2) {
case 1: {
Cake obj1=new Gems((Cake) new Toppings());
System.out.println(obj1.prepareCake());
System.out.println(obj1.cakePrice());
} break;
case 2: {
ChocoChips obj2=new ChocoChips((Cake) new Toppings());
System.out.println(obj2.prepareCake());
System.out.println(obj2.cakePrice());
} break;
case 3: {
Strawberries obj3=new Strawberries((Cake) new Toppings());
System.out.println(obj3.prepareCake());
System.out.println(obj3.cakePrice());
} break;
default: {
System.out.println("Variety not present");
} return;
}
System.out.println("Exit Bakery");
    }
}
