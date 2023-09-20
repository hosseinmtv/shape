public class Moraba extends Shape {
    private float zel;

    public float getZel() {
        return zel;
    }

    public void setZel(float tool) {
        this.zel = zel;
    }


    public float mohit(float zel) {
        setMohit(zel * 4);
        return getMohit();
    }

    public float masahat(float tool, float arz) {
        setMasahat(zel * zel);
        return getMasahat();
    }

    @Override
    public float masahat() {
        float masaahat = zel * zel;
        return masaahat;
    }

    @Override
    public float mohit() {
        float moh = zel * 4;
        return moh;

    }
}
