public abstract class CakeDecorator implements Cake{  
    private Cake newCake;  
    public CakeDecorator(Cake newCake)  {  
        this.newCake=newCake;  
    }  
    public String prepareCake(){  
        return newCake.prepareCake();   
    }  
    public double cakePrice(){  
        return newCake.cakePrice();  
    }  
}  