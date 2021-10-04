import java.util.ArrayList;

public class mediaFolder {
    private ArrayList<MediaTypes> mediaTypes;
    private String filePath;
    private static int totalMedia;

    public ArrayList getMediaTypes() {
        return mediaTypes;
    }
    public void setMediaTypes(ArrayList mediaTypes) {
        this.mediaTypes = mediaTypes;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public static int getTotalMedia() {
        return totalMedia;
    }
    public static void setTotalMedia(int totalMedia) {
        mediaFolder.totalMedia = totalMedia;
    }


}
