public class MediaType {
    
    private String genre; 
    
    private String name;
    private String fileExtension;
    private int fileSize; //File size in megabytes
    private boolean isVisual;
    private boolean isInteractive;
    private String defaultApp;
    private String filePath;

   

    
    //Defualt Constructor
    public MediaType(){
        this.genre = "";
        this.name = "";
        this.fileExtension = "";
        this.fileSize = 0;
        this.isVisual = false;
        this.isInteractive = false;
        this.defaultApp = "";
        this.filePath = "C:/";
    }

    //A constructor for a MediaType class which will take in a value for all instance variables and create an object using it
    public MediaType(String name, String filePath, String genre, String fileExtension, int fileSize, boolean isVisual, boolean isInteractive, String defaultApp) {
        this.genre = genre;
        this.name = name;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.isVisual = isVisual;
        this.isInteractive = isInteractive;
        this.defaultApp = defaultApp;
        this.filePath = filePath;
    }
    
    //Creating getters and setters for each instance variables
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFileExtension() {
        return fileExtension;
    }
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public int getFileSize() {
        return fileSize;
    }
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public boolean getIsVisual() {
        return isVisual;
    }
    public void setIsVisual(boolean isVisual) {
        this.isVisual = isVisual;
    }

    public boolean getIsInteractive() {
        return isInteractive;
    }
    public void setIsInteractive(boolean isInteractive) {
        this.isInteractive = isInteractive;
    }

    public String getDefaultApp() {
        return defaultApp;
    }
    public void setDefaultApp(String defaultApp) {
        this.defaultApp = defaultApp;
    }
    
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isEquals(MediaType that){
        return (this.getFileExtension().equals(that.getFileExtension())&&this.getName().equals(that.getName())&&(this.getFileSize()==that.getFileSize()));
    }
    
    public String toString() {
        return "Media -- defaultApp=" + defaultApp + ", fileExtension=" + fileExtension + ", filePath=" + filePath
                + ", fileSize=" + fileSize + ", genre=" + genre + ", isInteractive=" + isInteractive + ", isVisual="
                + isVisual + ", name=" + name;
    }

    

}
