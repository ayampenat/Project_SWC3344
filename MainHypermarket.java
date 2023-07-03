import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
import java.util.UUID;// Universally Unique Identifier.
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainHypermarket {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            Queue<CustomerInformation> customerQueue = new LinkedList<>();
            Queue<CustomerInformation> counter1 = new LinkedList<>();
            Queue<CustomerInformation> counter2 = new LinkedList<>();
            Queue<CustomerInformation> counter3 = new LinkedList<>();
            Stack<CustomerInformation> completedStack = new Stack<>();

            // Create file reader to read input file
            BufferedReader in = new BufferedReader(new FileReader("customer.txt"));

            // Create LinkedList
            LinkedList<CustomerInformation> customerList = new LinkedList<>();

            // Declare indata (a line in input file)
            String inData = null;

            double Total = 0.0;
            int totalCustomer = 0;

            while ((inData = in.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(inData, ";");
                // Declare variables
                String custID = st.nextToken();

                int counterPaid = Integer.parseInt(st.nextToken());

                ArrayList<ItemInformation> itemList = new ArrayList<>();
                StringTokenizer itemToken = new StringTokenizer(st.nextToken(), ":");
                while (itemToken.hasMoreTokens()) {
                    StringTokenizer infoToken = new StringTokenizer(itemToken.nextToken(), ",");
                    String itemID = infoToken.nextToken();
                    String itemName = infoToken.nextToken();
                    double itemPrice = Double.parseDouble(infoToken.nextToken());
                    String datePurchase = infoToken.nextToken();

                    ItemInformation item = new ItemInformation(itemID, itemName, itemPrice, datePurchase);
                    itemList.add(item);
                    counterPaid += itemPrice;
                }

                CustomerInformation cust = new CustomerInformation(custID, counterPaid);
                cust.addItems(itemList);
                customerList.add(cust);
                totalCustomer++;
            }
            in.close();

            new Gui(customerList, counter1, counter2, counter3, totalCustomer, completedStack);

        } catch (FileNotFoundException fnfe) {
            System.out.println("File cannot be found");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
