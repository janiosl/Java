public class Registro {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Janio", 3181);
        System.out.println(c1.toString());
    }
    public record Cliente (String nome, int id) {}    
}
