package at.streitner.beats.dao;

import at.streitner.beats.dto.ArtistNameID;
import at.streitner.beats.dto.SongDTO;
import at.streitner.beats.model.Artist;
import at.streitner.beats.model.Song;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Named
@Dependent
public class SongDAO {

    @Inject
    EntityManager em;

    public List<SongDTO> getAllSongs() {
        List<SongDTO> songDTOS = new ArrayList<>();
        List<Song> songs = em.createQuery("SELECT s FROM Song s", Song.class).getResultList();
        for(Song song : songs) {
            SongDTO dto = new SongDTO();
            dto.setId(song.getId());
            dto.setName(song.getName());
            dto.setCoverUrl(song.getCoverUrl());
            List<ArtistNameID> artists = new ArrayList<>();
            for(Artist artist: song.getArtists()) {
                artists.add(new ArtistNameID(artist.getId(), artist.getName()));
            }
            dto.setArtists(artists);
            songDTOS.add(dto);
        }
        return songDTOS;
    }

    public List<SongDTO> getSongsFromAlbum(int albumId) {
        List<SongDTO> songDTOS = new ArrayList<>();
        List<Song> songs = em.createQuery("SELECT s FROM Song s WHERE s.album.id =" + albumId, Song.class).getResultList();
        for(Song song : songs) {
            SongDTO dto = new SongDTO();
            dto.setId(song.getId());
            dto.setName(song.getName());
            dto.setCoverUrl(song.getCoverUrl());
            List<ArtistNameID> artists = new ArrayList<>();
            for(Artist artist: song.getArtists()) {
                artists.add(new ArtistNameID(artist.getId(), artist.getName()));
            }
            dto.setArtists(artists);
            songDTOS.add(dto);
        }
        return songDTOS;
    }
}
