import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class readFile {
    public static void main(String[] args) {
        String dir1 = "C:\\Users\\krodr\\Dropbox\\PC\\Desktop\\LISTA DE COMANDOS PARA ABRIR PROGRAMAS DE WINDOWS.pdf";
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(dir1));
            int A =0;
            String line1 = "";
            while (A != -1) {
                try {
                    A = Integer.parseInt(reader1.readLine());
                    if(A == -1){
                        continue;
                    }
                    char letra = (char) A;
                    line1 += letra;

                } catch (IOException ex) {
                    Logger.getLogger(readFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.print(line1.toString());
            try {
                reader1.close();
            } catch (IOException ex) {
                Logger.getLogger(readFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(readFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
