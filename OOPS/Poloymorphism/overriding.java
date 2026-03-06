
public class overriding {

    public static void main(String agrs[]) {
        deer eats = new deer();
        eats.eat();
    }
}
// Parent  class and child class  function will be same but defination will be diffrent when we call the function/ method  automatic overriding the parent  class and print the data in child  class (this is part on inheritance).

class Animal {

    void eat() {
        System.out.print("Eat anything");
    }
}

class deer extends Animal {

    void eat() {
        System.out.print("Eat  Grass");
    }
}
