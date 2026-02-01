import java.io.FileWriter; 
import java.io.IOException; 

class BigBang {
    public static void main(String[] args) {
        // Result array
        String[] result = new String[100];

        // Loop num from 1 to 100
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                result[num - 1] = "BIGBANG"; // divisible by both
            } else if (num % 3 == 0) {
                result[num - 1] = "BIG";     // divisible by 3
            } else if (num % 5 == 0) {
                result[num - 1] = "BANG";    // divisible by 5
            } else {
                result[num - 1] = String.valueOf(num);
            }
        }

        // Write array into output.json file
        try {
            FileWriter writer = new FileWriter("output.json");
            writer.write("[");
            for (int i = 0; i < result.length; i++) {
                writer.write("\"" + result[i] + "\"");
                if (i < result.length - 1) {
                    writer.write(", ");
                }
            }
            writer.write("]");
            writer.close();
            System.out.println("Array generated and saved to output.json");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
