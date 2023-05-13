public class Singleton {
    private static Singleton instance;
    private int value;

    private Singleton() {
        // Private constructor to prevent direct instantiation
        value = 0;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton instance doing something...");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
