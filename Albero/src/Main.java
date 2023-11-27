public class Main {
    public static void main(String[] args){
        Albero a1 = new Albero(5, new Albero(8,null,null), new Albero(10,null,null));
        Albero a2 = new Albero(4, new Albero(12,null,null), a1);
        Albero a3 = new Albero(9, a2, new Albero(6,null,null));
        System.out.println(a3.stampa());
        System.out.println("Massimo Bossetti: " + a3.max());
    }
}