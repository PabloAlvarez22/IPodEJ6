/**
 * @author pablo
 *
 */
public class CancionJJ implements ICancion {	

    private String title;
    private String artist;
    private String duration;
    private String album;
    private int id;

    public CancionJJ(String title, String artist, String duration, String album, int id) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
        this.id  = id;
    }

    @Override
    public String toString() {
        return this.id+". "+this.title+"-"+this.artist+"("+this.duration+")"+"["+this.album+"]";
    }

    @Override
    public void setTitle(String _title) {
        this.title = _title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setArtist(String _artist) {
        this.artist = artist;
    }

    @Override
    public String getArtist() {
        return this.artist;
    }

    @Override
    public void setAlbum(String _album) {
        this.album = _album;
    }

    @Override
    public String getAlbum() {
        return this.album;
    }

    @Override
    public void setDuration(String _duration) {
        this.duration = _duration;
    }

    @Override
    public String getDuration() {
        return this.duration;
    }

    @Override
    public void setID(int _id) {
        this.id = _id;
    }

    @Override
    public int getID() {
        return this.id;
    }
}
