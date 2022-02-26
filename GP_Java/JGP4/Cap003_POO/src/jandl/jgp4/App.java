/*
TESTAND CONSTRUÇÃO MANUAL DE PACOTES
*** Todos os os arquivos .java devem estar dentro do caminho:
    D:\JGP4\Cap003_POO\src\jandl\jgp4
*** Nas classes deve ser referenciado o pacote:    
    package jandl.jgp4;
*** No programa principal deve ser importadas as classes:
    import jandl.jgp4.Fibonacci;
    import jandl.jgp4.Progressao;
*** A compilação deve ser feita a partir do diretório:
    D:\JGP4\Cap003_POO
*** A chamada do compilador deve ser:
    javac -d D:\JGP4\Cap003_POO\bin D:\JGP4\Cap003_POO\src\jandl\jgp4\*.java
*** O compilador criará a classe principal no caminho:
    D:\JGP4\Cap003_POO\bin
*** O compilador criará as demais classes no caminho:
    D:\JGP4\Cap003_POO\bin\jandl\jgp4
*** Para execução a partir da classe App.class deve chamar java da seguinte forma:
    java -cp D:\JGP4\Cap003_POO\bin App
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
