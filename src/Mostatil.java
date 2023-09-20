public class Mostatil extends Shape {
    private float tool;
    private float arz;

    public float getTool() {
        return tool;
    }

    public void setTool(float tool) {
        this.tool = tool;
    }

    public float getArz() {
        return arz;
    }

    public void setArz(float arz) {
        this.arz = arz;
    }

    public float mohit(float tool, float arz) {
        setMohit(tool + arz * 2);
        return getMohit();
    }

    public float masahat(float tool, float arz) {
        setMohit(tool * arz);
        return getMasahat();
    }

    @Override
    public float masahat() {
        float a = tool * arz;
        return a;

    }

    @Override
    public float mohit() {
        float b = (tool + arz) * 2;
        return b;
    }
}
