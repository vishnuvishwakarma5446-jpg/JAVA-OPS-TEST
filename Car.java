import java.io.*;

public class Car {

    public static void main(String args[]) throws IOException {

        // Writing the data

        // Try block to check for exceptions
        try ( DataOutputStream dout =
                      new DataOutputStream(new FileOutputStream("file.tex")) ) {

            dout.writeDouble(9.9);
            dout.writeInt(77);
            dout.writeBoolean(true);
            dout.writeChar('9');
        }

        // Catch block to handle the exceptions
        catch (FileNotFoundException ex) {

            // Display message when FileNotFoundException occurs
            System.out.println("Cannot Open the Output File");
            return;
        }

        // Reading the data back.

        // Try block to check for exceptions
        try ( DataInputStream din =
                      new DataInputStream(new FileInputStream("file.tex")) ) {

            // Illustrating readDouble() method
            double a = din.readDouble();

            // Illustrating readInt() method
            int b = din.readInt();

            // Illustrating readBoolean() method
            boolean c = din.readBoolean();

            // Illustrating readChar() method
            char d = din.readChar();

            // Print the values
            System.out.println("abc : " + a + " " + b + " " + c + " " + d);
        }

        // Catch block to handle the exceptions
        catch (FileNotFoundException e) {

            // Display message when FileNotFoundException occurs
            System.out.println("Cannot Open the Input File");
            return;
        }
    }
}

