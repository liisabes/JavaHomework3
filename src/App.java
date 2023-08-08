public class App {
    public static void main(String[] args) throws Exception {

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(1);

        
        list.print();
        list.revert();

    }
}
