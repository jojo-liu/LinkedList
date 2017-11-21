public class Main {

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.append(4);
        ls.append(3);
        ls.append(2);
        ls.append(5);
        ls.append(1);
        ls.append(7);
        ls.removeTail();
        ls.removeGreatThan(4);
    }
}
