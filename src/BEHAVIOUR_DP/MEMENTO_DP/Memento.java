package BEHAVIOUR_DP.MEMENTO_DP;

public class Memento {
    /**
     * 
     * here fields are private so that we can makeMemento immutable
     */
    private int cursorX, cursorY;
    private String text;
    Memento(int cursorX, int cursorY, String text) {
        this.cursorX = cursorX;
        this.cursorY = cursorY;
        this.text = text;
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public String getText() {
        return text;
    }
}

