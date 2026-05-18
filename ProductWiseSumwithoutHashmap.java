 import java.io.File;
import java.util.Scanner;

public class ProductWiseSumwithoutHashmap {
    public static void main(String[] args) {

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;

        try {

            File file = new File("C:\\Users\\Syed Yasir Ali\\Desktop\\SalesEVESession.txt");
            Scanner sc = new Scanner(file);

            sc.nextLine(); // skip heading

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                String[] data = line.split("\t");

                String itemCode = data[0];
                int qty = Integer.parseInt(data[3]);

                if (itemCode.equals("A")) {
                    sumA = sumA + qty;
                }
                else if (itemCode.equals("B")) {
                    sumB = sumB + qty;
                }
                else if (itemCode.equals("C")) {
                    sumC = sumC + qty;
                }
                else if (itemCode.equals("D")) {
                    sumD = sumD + qty;
                }
            }

            System.out.println("Product A = " + sumA);
            System.out.println("Product B = " + sumB);
            System.out.println("Product C = " + sumC);
            System.out.println("Product D = " + sumD);

            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
