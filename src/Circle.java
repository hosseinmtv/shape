public class Circle extends Shape {
    private float ghotr;
    private float shoaa;
    private final int p = 3;

    public float getGhotr() {
        return ghotr;
    }

    public void setGhotr(float ghotr) {
        this.ghotr = ghotr;
    }

    public float getShoaa() {
        return shoaa;
    }

    public void setShoaa(float shoaa) {
        this.shoaa = shoaa;
    }


    @Override
    public float masahat() {
        float mass = shoaa * shoaa * p;
        return mass;

    }

    @Override
    public float mohit() {
        float mohit = ghotr * p;
        return mohit;
    }
}
