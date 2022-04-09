package at.streitner.beats.dao;

import at.streitner.beats.model.Artist;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
@Dependent
public class ArtistDao {

    @Inject
    EntityManager em;

    public List<Artist> getAllArtist() {
        List<Artist> artists = em.createQuery("SELECT a FROM Artist a", Artist.class).getResultList();
        artists.forEach(artist -> artist.setAlbums(null));
        return artists;
    }

    public List<Artist> getAllArtistWithAlbums() {
        return em.createQuery("SELECT a FROM Artist a", Artist.class).getResultList();
    }
}
