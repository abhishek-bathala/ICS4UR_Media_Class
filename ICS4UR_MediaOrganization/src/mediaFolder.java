import java.util.ArrayList;

public class mediaFolder {
    private ArrayList<MediaType> mediaTypes;
    private static int totalMedia;

    public mediaFolder(ArrayList<MediaType> mediaTypes, String filePath) {
        this.mediaTypes = mediaTypes;
    }

    /*public mediaFolder()
    {
        MediaType temp = new MediaType();
        this.mediaTypes = temp;

    }*/
    public ArrayList<MediaType> getMediaTypes() {
        return mediaTypes;
    }
    public void setMediaTypes(ArrayList<MediaType> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }
    
    public static int getTotalMedia() {
        return totalMedia;
    }
    public static void setTotalMedia(int totalMedia) {
        mediaFolder.totalMedia = totalMedia;
    }

    public void addMedia(MediaType media)
    {
        mediaTypes.add(media);
        totalMedia++;
    }

    public void listMedia()
    {
        for(int i = 0; i < mediaTypes.size(); i++){
            System.out.printf("%s", this.getClass());
        }
    }
    
    public void cleanUp()
    {
        for(int i = 0; i < mediaTypes.size(); i++){
            for(int j = i; j < mediaTypes.size(); j++){
                if(mediaTypes.get(i).equals(mediaTypes.get(j))){
                    mediaTypes.remove(j);
                }
            }
        }
    }

    public void openMedia(int index)
    {
        System.out.println("Opening " + mediaTypes.get(index).getName() + " with " + mediaTypes.get(index).getDefaultApp());
    }
}
