 import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
public class IDWiseSumwithHashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> idMap = new HashMap<>();

        try {

            File file = new File("C:\\Users\\Syed Yasir Ali\\Desktop\\SalesEVESession.txt");
            Scanner sc = new Scanner(file);

            sc.nextLine();

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                String[] data = line.split("\t");

                String repID = data[5];
                int qty = Integer.parseInt(data[3]);

                if (idMap.containsKey(repID)) {

                    int oldValue = idMap.get(repID);

                    idMap.put(repID, oldValue + qty);

                } else {

                    idMap.put(repID, qty);
                }
            }

            System.out.println("ID WISE SUM");

            for (String key : idMap.keySet()) {

                System.out.println(key + " = " + idMap.get(key));
            }

            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
