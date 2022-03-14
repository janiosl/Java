package pac.trd;
public class P0801Thread extends Thread {
    //Atributos
    int soma = 0;
    public void run() {        
        System.out.println("Start: " + getName());
        for (int i = 0; i<4; i++) {
            System.out.println(i + "-" + getName());
            this.soma += 2;
        }        
        System.out.println("End: " + getName());
        System.out.println("Thread: " + getName() + " - Result: " + this.soma);
    }
}
