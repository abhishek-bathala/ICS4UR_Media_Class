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
    
   public void sortName(){
        for(int j = 0; j < this.mediaTypes.size(); j++){
            for(int i = 0; i < this.mediaTypes.size(); i++){
                if (this.mediaTypes.get(i).getName().compareTo(this.mediaTypes.get(j).getName()) > 0){
                    MediaType replace = this.mediaTypes.get(i);
                    this.mediaTypes.set(i, this.mediaTypes.get(j));
                    this.mediaTypes.set(j, replace);
                }
            }
        }
    }
    public void sortGenre(){
        for(int i = 0; i < this.mediaTypes.size(); i++){
            for(int j = 0; j < this.mediaTypes.size(); j++){
                if(this.mediaTypes.get(i).getGenre().equals(this.mediaTypes.get(i).getGenre())){
                    MediaType replace = this.mediaTypes.get(i);
                    this.mediaTypes.set(i, this.mediaTypes.get(j));
                    this.mediaTypes.set(j, replace);
                }
            }
        }
    }
   
    @Override
    public String toString() {
        return "mediaFolder [mediaTypes=" + mediaTypes + "]";
    }
}
