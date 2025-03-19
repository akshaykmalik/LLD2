package BEHAVIOUR_DP.MEMENTO_DP;

public class Client {
    public static void main(String[] args) {
        Editor vsCode = new Editor(1, 0, "ipsum ipsum");
        Memento snapshot = vsCode.getSnapshot();

        System.out.println(vsCode);
        
        History history = new History();
        history.addSnapshot(snapshot);

        vsCode.setCursorX(2);

        System.out.println(vsCode);

        vsCode.restoreState(history.getSnapShot());

        System.out.println(vsCode);

    }
}
