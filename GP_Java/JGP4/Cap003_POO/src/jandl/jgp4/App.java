/*
TESTANDO CONSTRUÇÃO MANUAL DE PACOTES
Detalhes em:
https://github.com/janiosl/Java/blob/main/GP_Java/JGP4/Cap003_POO/README.md
*/
import jandl.jgp4.Fibonacci;
import jandl.jgp4.Progressao;

public class App {
    public static void main(String args[]) {
        System.out.println("Manual bulding of packages");
        //Teste do método da sequencia fibonacci
        long fb;
        int num = 10;
        System.out.println("Fibonacci sequence of the number " + num);
        fb = Fibonacci.fibonacci(num);        
        System.out.println(fb);
        //Teste de todos os métodos de duas classes do pacote
        System.out.println("Fibonacci, Arithmetric and Geometric progression:");
        for(int n=0; n<10; n++) {
			System.out.printf("Fibo: %6d Arit: %6d Geom: %6d\n",
				Fibonacci.fibonacci(n),
				Progressao.aritmetica(0, 2, n),
				Progressao.geometrica(1, 3, n));
		}
    }   
}
