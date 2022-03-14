//package threads.src.pac.mon;
import threads.src.pac.mon.*;
public class Monitor {
    public static void main(String[] args) {
        FileMonitor monitor = null;
        if (args.length > 0) {
            System.out.println("Main[begin]");
            monitor = new FileMonitor(args[0]);
            if (args.length > 1 && args[1].equalsIgnoreCase("-s")) {
                monitor.setDaemon(true);
            }
            monitor.start();
            try {
                Thread.sleep(10_000); //Pausa dez segundos
            } catch (InterruptedException e) {}
            System.out.println("Main[end]");
        } else {
            System.out.println("Args not provided.\nHow to use it: java Monitor <nomeArquivo> [-servico]");
        }
    }
}
