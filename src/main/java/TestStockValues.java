import java.util.Scanner;

/**
 * Created by Isa on 22/10/2016.
 */
public class TestStockValues {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of companies: ");
        int numberOfCompanies = scan.nextInt();
        String[] values = StockValues.getStockValues(numberOfCompanies);
        for(int i = 0; i<values.length; i++){
            System.out.println(i+1 + ". " + values[i]);
        }
    }
}
