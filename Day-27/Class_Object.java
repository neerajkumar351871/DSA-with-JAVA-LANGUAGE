public class Class_Object {

    public static void main(String[] args) {

        // classname  objectname  =  new keyword   classname with parenthesis()
        Pen data = new Pen();
        data.setcolor("Red");
        System.out.println(data.color);
         data.settips(5);
         System.out.println(data.tip);

    }
}
// Here class Declare

class Pen {

    String color;
    int tip;
    // Function set color;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    // Function settips.
    void settips(int newtipes) {
        tip = newtipes;
    }
}
