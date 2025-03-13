package PROXY_DP;

public class YoutubeServiceAdapter implements YoutubeAdapter {
    @Override
    public void downloadVideo(int id) {
        System.out.println("downloading video " + id);
    }

    @Override
    public String getVideoInfo(int id) {
        return "fetching youtube video info " + id;
    }
}
