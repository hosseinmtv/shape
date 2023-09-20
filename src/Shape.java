public abstract class Shape {
    private float masahat;
    private float mohit;

    public float getMasahat() {
        return masahat;
    }

    public void setMasahat(float masahat) {
        this.masahat = masahat;
    }

    public float getMohit() {
        return mohit;
    }

    public void setMohit(float mohit) {
        this.mohit = mohit;
    }

    public abstract float masahat();

    public abstract float mohit();


}
