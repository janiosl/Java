# TESTANDO CONSTRUÇÃO MANUAL DE PACOTES

## 1 Criação
* Todos os os arquivos .java devem estar dentro do caminho:
    *D:\JGP4\Cap003_POO\src\jandl\jgp4*
* Nas classes deve ser referenciado o pacote:    
    ```package jandl.jgp4;```
* No programa principal deve ser importadas as classes:
    ```import jandl.jgp4.Fibonacci;```
    ```import jandl.jgp4.Progressao;```
## 2 Compilação
* A compilação deve ser feita a partir do diretório:
    *D:\JGP4\Cap003_POO*
* A chamada do compilador deve ser:
    ```javac -d D:\JGP4\Cap003_POO\bin D:\JGP4\Cap003_POO\src\jandl\jgp4\*.java```
* O compilador criará a classe principal no caminho:
    *D:\JGP4\Cap003_POO\bin*
* O compilador criará as demais classes no caminho:
    *D:\JGP4\Cap003_POO\bin\jandl\jgp4*
## 3 Execução
* Para execução a partir da classe App.class deve chamar java da seguinte forma:
    ```java -cp D:\JGP4\Cap003_POO\bin App```
    
    OBSERVAÇÃO: A estrutura de pastas e drivers acima considera o uso do Windows e uma driver nomeado como D:, mas deve ser adaptada para realidade, seguindo a mesma lógica usada.
