public class ShutdownHook {
    public static void main(String args[]){
        System.out.println("--- Start ---");
        //Recupera Runtime
        Runtime rt = Runtime.getRuntime();
        //Thread de encerramento da aplicação
        rt.addShutdownHook(
            new Thread() {
                public void run() {
                    System.out.println("\nHook is a codfish!");
                }
            }
        );
        //Recuperação de informações do ambiente
        System.out.println("Processors: " + rt.availableProcessors());
        System.out.println("Used memory: " + (rt.totalMemory()-rt.freeMemory()));
        System.out.println("Free memory: " + rt.freeMemory());
        System.out.println("Total memory: " + rt.totalMemory());
        System.out.println("Maximum memory: " + rt.maxMemory());
        System.out.println("--- End ---");
        //Encerramento
        rt.exit(0);
    }    
}
