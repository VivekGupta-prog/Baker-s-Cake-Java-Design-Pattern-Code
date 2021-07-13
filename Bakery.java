public abstract class Bakery {
    private void basicPreparations(){
        System.out.println("Basic preparations done!");
    }
    abstract void buildBatter();
    abstract void buildIcing();
    abstract void buildBake();
    abstract void buildLayers();
    public void templateMethod(){
        basicPreparations();
        buildBatter();
        buildBake();
        buildLayers();
        buildIcing();
        System.out.println("Base work COMPLETE!!!\n");
    }
}
