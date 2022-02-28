public class Strings {
    public static void main(String[] args) {
        //==========================================//
        //Strings imutáveis - Classe String         //
        //==========================================//
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
        int pos = nome.indexOf('L');
        System.out.println("Posicao da letra L=" + pos);
        System.out.println("Caractere na posicao " + pos + "=" + nome.charAt(pos));
        System.out.println("Substring na posicao " + pos + "=" + nome.substring(pos));
        String linguagens = "Java, C, Python, R, VBA";
        System.out.println("Texto original: " + linguagens);
        String[] partes = linguagens.split(", ");
        System.out.println("Texto fatiado: ");
        for (int i=0; i<partes.length; i++) {
            System.out.println(partes[i]);
        }
        //==========================================//
        //Strings mutáveis - Classe StringBuffer    //
        //==========================================//
        System.out.println("*** STRINGS MUTAVEIS ***");
        //Exemplo 1
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<10; i++) {
            sb.append(i);
            sb.append(',');
        }
        System.out.println(sb.toString());
        //Exemplo 2
        String lg = "Linguagem";
        String nm = "Java";
        StringBuffer linguagem = new StringBuffer(); //Objeto vazio
        linguagem.append(lg); //Adição da primeira palavra
        linguagem.append(nm);
        //Palavras adicionadas sem espaço
        System.out.println(linguagem);
        //Identificação da posição para inserir um espaço
        int idx = linguagem.indexOf("J");
        System.out.println(idx);
        //Inserção e conferência do resultado   
        linguagem.insert(idx, " ");
        System.out.println(linguagem);
        //==========================================//
        //Strings mutáveis - Classe StringBuilder   //
        //==========================================//
        /*
        StringBuilder tem os mesmos métodos e forma de uso de StringBuffer,
        contudo não realiza sincronização (compartilhamento entre threads).
        Por isso, é mais eficiente para usos simples.
        */
        System.out.println("*** STRINGS MUTAVEIS 2 ***");
        StringBuilder sbb = new StringBuilder();
        for (int i=0; i<10; i++) {
            sbb.append(i);
            sbb.append(',');
        }
        System.out.println(sbb.toString());
        sbb.append(10);
        sbb.append("]");
        sbb.insert(0, "[");
        System.out.println(sbb.toString());
        StringBuilder ling = new StringBuilder(lg);
        ling.append("s{C, ");
        ling.append(nm);
        ling.append(", Python, R}");
        System.out.println(ling.toString());
    }
}
