package demo3;

public class Main {
    public static void main(String[] args) {

    }

    static <smartphone extends Smartphone> void printSmartphone(smartphone SmartPhone) {
        System.out.println(SmartPhone);
    }

    static <simbian extends Simbian> void printSimbian(simbian Simbian) {

        System.out.println(Simbian);
    }
}
