package jandl.jgp4;
public class Progressao {
    public static long aritmetica(int ini, int razao, int nTermos) {        
        long res = ini;
		for(int t=0; t<nTermos; t++, res += razao);
		return res;
    }
    public static long geometrica(int ini, int razao, int nTermos) {        
        long res = ini;
		for(int t=0; t<nTermos; t++, res *= razao);
		return res;
    }
}
