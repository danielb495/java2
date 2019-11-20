public class Dog {
    int size;

    public void bark() {
        if (size > 60) {
            System.out.println("Woof woof!");
        } else if (size > 14) {
            System.out.println("Ruff ruff!");
        } else {
            System.out.println("Yip yip");
        }
    }

}

