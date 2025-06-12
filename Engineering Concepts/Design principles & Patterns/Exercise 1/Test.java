public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");
        System.out.println("Both logger instances are same: " + (logger1 == logger2));
    }
}
