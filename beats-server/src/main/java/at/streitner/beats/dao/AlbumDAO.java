package at.streitner.beats.dao;

import at.streitner.beats.dto.AlbumDTO;
import at.streitner.beats.dto.ArtistNameID;
import at.streitner.beats.model.Album;
import at.streitner.beats.model.Artist;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Named
@Dependent
public class AlbumDAO {

    @Inject
    EntityManager em;

    public List<AlbumDTO> getAllAlbums() {
        List<AlbumDTO> albumDTOS = new ArrayList<>();
        List<Album> albums = em.createQuery("SELECT a FROM Album a", Album.class).getResultList();
        albums.forEach(album -> album.setSongs(null));
        for(Album album : albums) {
            AlbumDTO dto = new AlbumDTO();
            dto.setArtist(new ArtistNameID(album.getArtist().getId(), album.getArtist().getName()));
            dto.setAlbum(album);
            albumDTOS.add(dto);
        }
        return albumDTOS;
    }
}
