import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Isa on 22/10/2016.
 */
public final class StockValues {

    public static String[] getStockValues(int numberOfCompanies){
        Scanner scan = new Scanner(System.in);
        try{
            String[] companies = new String[numberOfCompanies];
            for(int i = 0; i<companies.length; i++){
                System.out.print("Company name: ");
                companies[i] = scan.nextLine();
            }
            Map<String, Stock> stocks = YahooFinance.get(companies);
            String[] values = new String[numberOfCompanies];
            for(int i = 0; i<companies.length; i++){
                values[i] = String.valueOf(stocks.get(companies[i]).getQuote().getPrice());
            }
            return values;
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }
}
