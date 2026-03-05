
public class Setterandgetter {

    public static void main(String agrs[]) {
        pen pendata = new pen();
        pendata.setcolor("Red");
        pendata.settip(545);
        System.out.println("Pen color:" + pendata.getcolor());
        System.out.println("Pen Tips :" + pendata.gettips());

    }

}

class pen {

    private int tips;
    private String color;

    void setcolor(String color) {
        this.color = color;
    }

    void settip(int tips) {
        this.tips = tips;
    }

    int getcolor() {
        return this.tips;
    }

    String gettips() {
        return this.color;
    }

}
