package at.streitner.beats.dto;

import java.util.List;

public class SongDTO {
    private int id;
    private String name;
    private String coverUrl;
    private List<ArtistNameID> artists;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public List<ArtistNameID> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistNameID> artists) {
        this.artists = artists;
    }
}
