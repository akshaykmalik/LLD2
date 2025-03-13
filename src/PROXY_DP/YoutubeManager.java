package PROXY_DP;

public class YoutubeManager {
    YoutubeAdapter ya;
    YoutubeManager(YoutubeAdapter ya) {
        this.ya = ya;
    }
    void downloadVideo() {
        ya.downloadVideo(1);
    }
    public static void main(String[] args) {
        //here youtube manager us is expecting YoutubeAdapter instance
        /*
         * since CachedYoutubeServiceAdapterProxy is also 
         */
        YoutubeManager ym = new YoutubeManager(new CachedYoutubeServiceAdapterProxy(new YoutubeServiceAdapter()));
        ym.downloadVideo();
    }
}
