package PROXY_DP;

import java.util.*;

public class CachedYoutubeServiceAdapterProxy implements YoutubeAdapter {
    YoutubeServiceAdapter ysa;
    HashMap<Integer,String> videoMap;
    CachedYoutubeServiceAdapterProxy(YoutubeServiceAdapter ysa) {
        this.ysa = ysa;
        videoMap = new HashMap<>();
    }

    @Override
    public void downloadVideo(int id) {
        if(videoMap.containsKey(id)) {
            System.out.println(videoMap.get(Integer.valueOf(id)));
        } else {
            ysa.downloadVideo(id);
        }
    }

    @Override
    public String getVideoInfo(int id) {
        return "fetching cached video info";
    }
}
