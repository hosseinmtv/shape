public class Circle extends Shape {

    private float shoaa;
    private final int p = 3;


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
        float mohit = shoaa * shoaa * p;
        return mohit;
    }
}
