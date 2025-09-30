
public class LinearSearch {

    public static int LinearSearchs(String fruits[], String key) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String fruits[] = {"Apple", "Mango", "Grapes", "Papaya"};
        String key = "Mango";
        int fruitsvalue = LinearSearchs(fruits, key);
        for (int i = 0; i < fruits.length; i++) {
            if (fruitsvalue == 1) {
                System.out.println(" Fruits is Available:" + fruits[i]);
                break;
            } else {
                System.out.println(" Fruits is NOt  Available:");
                break;
            }

        }

    }
}
