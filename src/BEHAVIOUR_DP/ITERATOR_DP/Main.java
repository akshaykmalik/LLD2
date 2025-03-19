package BEHAVIOUR_DP.ITERATOR_DP;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> ll = new CustomLinkedList<>();
        for(int i=0; i<10; i++) {
            ll.add(i);
        }
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

