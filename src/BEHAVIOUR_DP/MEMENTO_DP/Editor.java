package BEHAVIOUR_DP.MEMENTO_DP;

/*
 * Editor is originator class. 
 * originator class in the one whose object state gets saved and r
 */
public class Editor {
    private int cursorX, cursorY;
    private String text;

    Editor(int cursorX, int cursorY, String text) {
        this.cursorY = cursorY;
        this.cursorX = cursorX;
        this.text = text;
    }

    Memento getSnapshot() {
        return new Memento(cursorX, cursorY, text);
    }

    void restoreState(Memento snapshot) {
        this.cursorX = snapshot.getCursorX();
        this.cursorY = snapshot.getCursorY();
        this.text = snapshot.getText();
    }

    public String toString() {
        return cursorX + ", " + cursorY + ", " + text;
    }

    public void setCursorX(int cx) {
        cursorX = cx;
    }
}