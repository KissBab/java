package ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {

    final static Logger logger=Logger.getLogger(Payment.class);

    public static void pay(Electricity electricity, Water water) {
        logger.info("This is Info - კომუნალური გადახდილია: " + electricity);
        logger.info("This is Info - კომუნალური გადახდილია: " + water);

    }

    public static void main(String[] args) {
        Electricity electricity = new Electricity("ibasd123", 10.5);
        Water water = new Water("123", 2.3);

        pay(electricity, water);

    }
}
