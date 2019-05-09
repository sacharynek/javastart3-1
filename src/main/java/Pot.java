public class Pot {

    private String make;
    private double weight;
    private String material;
    private boolean isStainless;

    public Pot(){}

    public Pot( String make, double weight, String material, boolean isStainless){
        this.make = make;
        this.weight = weight;
        this.material = material;
        this.isStainless = isStainless;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isStainless() {
        return isStainless;
    }

    public void setStainless(boolean stainless) {
        isStainless = stainless;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "make='" + make + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", isStainless=" + isStainless +
                '}';
    }
}
