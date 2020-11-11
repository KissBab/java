package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;
import java.util.Scanner;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int unconverted;
        System.out.println("შეიყვანეთ რიცხვი: ");
        unconverted = input.nextInt();

        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.setExchangeRate(3);

        System.out.println(currencyService.convert(3));
        System.out.println(currencyService.convert(3.3186));

        logger.info("\nთავდაპირველი თანხა: " + unconverted
                + "\n\tსაბოლოო თანხა: " + currencyService.convert(unconverted));

    }
}
