# TESTANDO CONSTRUÇÃO MANUAL DE PACOTES

**OBSERVAÇÃO**: A estrutura de pastas e drivers considera o uso do Windows e um driver nomeado como D:, mas deve ser adaptada para realidade, seguindo a mesma lógica usada.

## 1 Criação
* Todos os os arquivos ```.java``` devem estar dentro do caminho:
<pre><code>
   D:\JGP4\Cap003_POO\src\jandl\jgp4
</code></pre>
* Nas classes deve ser referenciado o pacote:    
<pre><code>
   package jandl.jgp4;      
</code></pre>
* No programa principal devem ser importadas as classes:
<pre><code>    
   import jandl.jgp4.Fibonacci;
   import jandl.jgp4.Progressao;
</code></pre>
## 2 Compilação
* A compilação deve ser feita a partir do diretório:
<pre><code>
   D:\JGP4\Cap003_POO
</code></pre>    
* A chamada do compilador deve ser:
<pre><code>
   javac -d D:\JGP4\Cap003_POO\bin D:\JGP4\Cap003_POO\src\jandl\jgp4\*.java
</code></pre> 
* O compilador criará a classe principal no caminho:
<pre><code>
   D:\JGP4\Cap003_POO\bin
</code></pre>
* O compilador criará as demais classes no caminho:
<pre><code>
   D:\JGP4\Cap003_POO\bin\jandl\jgp4
</code></pre>    
## 3 Execução
* Para execução a partir da classe App.class deve chamar java da seguinte forma:
<pre><code>
   java -cp D:\JGP4\Cap003_POO\bin App```
</code></pre>    

**OBSERVAÇÃO**: A estrutura de pastas e drivers acima considera o uso do Windows e uma driver nomeado como D:, mas deve ser adaptada para realidade, seguindo a mesma lógica usada.
