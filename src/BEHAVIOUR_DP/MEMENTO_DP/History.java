package BEHAVIOUR_DP.MEMENTO_DP;
import java.util.List;
import java.util.LinkedList;

public class History {
    List<Memento> snapshotList = new LinkedList<>();

    void addSnapshot(Memento... snapshots) {
        for(Memento snapshot : snapshots) {
            snapshotList.add(snapshot);
        }
    }

    Memento getSnapShot() {
        if(snapshotList.size() == 0) {
            return null;
        }
        
        return snapshotList.remove(0);
    }
}
