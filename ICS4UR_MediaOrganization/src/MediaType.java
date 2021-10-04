public class MediaType {
    
    private String genre; 
    private String fileExtension;
    private int fileSize; //File size in megabytes
    private boolean isVisual;
    private boolean isInteractive;
    private String defaultApp;

    public MediaType(String genre, String fileExtension, int fileSize, boolean isVisual, boolean isInteractive,
            String defaultApp) {
        this.genre = genre;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.isVisual = isVisual;
        this.isInteractive = isInteractive;
        this.defaultApp = defaultApp;
    }
    
    //Creating getters and setters for each instance variables
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
    


}
