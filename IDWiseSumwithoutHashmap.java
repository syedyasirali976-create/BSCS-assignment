import java.io.File;
import java.util.Scanner;

public class IDWiseSumwithoutHashmap {
    public static void main(String[] args) {

        int e011 = 0;
        int e012 = 0;
        int e013 = 0;
        int e014 = 0;

        try {

            File file = new File("C:\\Users\\Syed Yasir Ali\\Desktop\\SalesEVESession.txt");
            Scanner sc = new Scanner(file);

            sc.nextLine();

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                String[] data = line.split("\t");

                String repID = data[5];
                int qty = Integer.parseInt(data[3]);

                if (repID.equals("E011")) {
                    e011 = e011 + qty;
                }
                else if (repID.equals("E012")) {
                    e012 = e012 + qty;
                }
                else if (repID.equals("E013")) {
                    e013 = e013 + qty;
                }
                else if (repID.equals("E014")) {
                    e014 = e014 + qty;
                }
            }

            System.out.println("E011 = " + e011);
            System.out.println("E012 = " + e012);
            System.out.println("E013 = " + e013);
            System.out.println("E014 = " + e014);

            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
    
