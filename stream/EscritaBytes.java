import java.io.*;
public class EscritaBytes {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Invalid arguments or not arguments provided. How to use\njava EscritaBytes <arquivo>");
            System.exit(-1);
        }
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(args[0]))) {
            System.out.println("File '" + args[0] + "' open.");
            int quant = 10;
            try {
                quant = Integer.parseInt(args[1]);
            } catch (Exception e) {
                System.out.println("Using default 10");
            }
            System.out.println("Creating content...");
            for (int i = 0; i < quant; i++) {
                double aux = Math.random();
                dos.writeInt(i);
                dos.writeDouble(aux);
                System.out.println("#" + i + " : " + aux);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(-1);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File '" + args[0] + "' closed.");
    }    
}
