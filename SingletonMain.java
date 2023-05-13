public class SingletonMain {
    public static void main(String[] args) {
        // Get a reference to the Singleton instance
        Singleton singletonInstance = Singleton.getInstance();


        // Use the instance to call methods or access fields
        singletonInstance.doSomething();
        int value = singletonInstance.getValue();
        System.out.println("Initial value: " + value);

        singletonInstance.setValue(42);
        value = singletonInstance.getValue();
        System.out.println("New value: " + value);

        // Get another reference to the Singleton instance
        Singleton anotherSingletonInstance = Singleton.getInstance();
        value = anotherSingletonInstance.getValue();
        System.out.println("Value from another instance: " + value);
        Singleton a = Singleton.getInstance();
        a.setValue(3);
        System.out.println(singletonInstance.getValue());

    }
}
