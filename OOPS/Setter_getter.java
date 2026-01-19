
public class Setter_getter {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        // caller setter funcion to set value:
        p1.setcolor("Red");
        p1.setTips(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTips());

    }
}

class Pen {

    private String color;
    private int tips;

// Setter function are used to set the value of var;
    public void setcolor(String newColor) {
        this.color = newColor;
    }

    public void setTips(int newTips) {
        this.tips = newTips;
    }
// Getter function : get the value 

    String getColor() {
        return this.color;
    }

    int getTips() {
        return this.tips;
    }

}
