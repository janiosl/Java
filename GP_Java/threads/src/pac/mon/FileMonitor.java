package threads.src.pac.mon;
import java.io.File;
public class FileMonitor extends Thread {
    private File file;
    public boolean active;
    public FileMonitor(String fileName) {
        this.file = new File(fileName);        
    }
    public void run() {
        active = true;
        do {
            System.out.println(this);
            try {
                Thread.sleep(2000); //Pausa de 2 segundos
            } catch (InterruptedException e) {}
        } while (active);
    }
    public File getFile() {
        return this.file;
    }
    public String toString() {
        //Se verdadeiro exibe serviço, caso contrário exibe user
        String mode = isDaemon() ? "service" : "user";
        //Caso verdadeiro exibe tamanho, caso contrário informa inexistência
        String size = file.exists() ? file.length() + "bytes" : "don't exist";
        return String.format("[FileMonitor|%s] %s:%s", mode, file.getAbsolutePath(), size);
    }    
}
