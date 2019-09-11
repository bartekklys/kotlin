import java.io.File;

public class Main {


    public static void main(String[] args) {


        String x = "x";

        String x1 = hexToAscii(x.replaceAll(" ", "").replaceAll("\n", "").trim());
        System.out.println(x1);


    }

    private static String hexToAscii(String hexStr) {
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }

        return output.toString();
    }
}
