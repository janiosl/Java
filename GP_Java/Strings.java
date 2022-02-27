public class Strings {
    public static void main(String[] args) {
        //Strings imutáveis - Classe String
        System.out.println("*** STRINGS IMUTAVEIS ***\n*** Criando strings ***");
        //Criação explícita
        char[] letras = {'J', 'a', 'v', 'a'};
        String palavra1 = new String(letras);
        String palavra2 = new String("Java");
        //Criaçaõ implícita
        String palavra3 = "Java"; //Padrão usado nos exercícios anteriores
        System.out.println(palavra1 + "\n" + palavra2 + "\n" + palavra3);
        //Operações com string
        System.out.println("*** Operacaoes com strings ***");
        String nome = "Janio de Souza Lima";
        String trecho1 = "Janio";
        System.out.println("String analisada: " + nome + "\nTrecho procurado: " + trecho1);
        System.out.println("Comparando igualdade = " + trecho1.equals(nome));
        String trecho2 = "JAN";
        System.out.println("Trecho procurado: " + trecho2);
        System.out.println("Contem o trecho = " + nome.contains(trecho2));
        System.out.println("Repetindo com string convertida para maiuscula");
        System.out.println("Contem o trecho = " + nome.toUpperCase().contains(trecho2));
        //Strings mutáveis - Classe StringBuffer
        String linguagens = "Java, C, Python, R, VBA";
        System.out.println("Texto original: " + linguagens);
        String[] partes = linguagens.split(", ");
        System.out.println("Texto fatiado: ");
        for (int i=0; i<partes.length; i++) {
            System.out.println(partes[i]);
        }            
    }
}
