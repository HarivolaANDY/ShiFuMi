public class Main {
    public static void main(String[] args) {
        var pierre= new Pierre();
        var papier= new Papier();
        var ciseaux= new Ciseaux();
        System.out.println(papier.Fight(pierre));
    }
}