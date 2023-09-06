public class Mejeriprodukt {
    float age;
    // i kg
    float amount;
    String colour;
    public Mejeriprodukt(String color, Object obj ) {
        this.colour = color;
        this.age = 0;
            try {
                this.amount = (float) obj;
            } catch(Exception e) {
                e.printStackTrace();
                this.amount = 1f;
            }
    }
    public void ruttna() {
        this.age++;
    }
    public void dricka(float am) {
        if(this.amount >= am) {
            this.amount -= am;
        } else {
            this.amount = 0;
        }
    }
}
