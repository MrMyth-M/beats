package at.streitner.beats.dto;

import at.streitner.beats.model.Album;

public class AlbumDTO {
    private Album album;
    private ArtistNameID artist;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public ArtistNameID getArtist() {
        return artist;
    }

    public void setArtist(ArtistNameID artist) {
        this.artist = artist;
    }
}
