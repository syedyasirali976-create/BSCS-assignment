import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class ProductWiseSumwithHashmap{
    public static void main(String[] args) {

        HashMap<String, Integer> productMap = new HashMap<>();

        try {

            File file = new File("C:\\Users\\Syed Yasir Ali\\Desktop\\SalesEVESession.txt");
            Scanner sc = new Scanner(file);

            sc.nextLine();

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                String[] data = line.split("\t");

                String itemCode = data[0];
                int qty = Integer.parseInt(data[3]);

                if (productMap.containsKey(itemCode)) {

                    int oldValue = productMap.get(itemCode);

                    productMap.put(itemCode, oldValue + qty);

                } else {

                    productMap.put(itemCode, qty);
                }
            }

            System.out.println("PRODUCT WISE SUM");

            for (String key : productMap.keySet()) {

                System.out.println(key + " = " + productMap.get(key));
            }

            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
