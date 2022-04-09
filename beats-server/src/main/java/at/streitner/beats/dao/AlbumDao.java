package at.streitner.beats.dao;

import at.streitner.beats.model.Album;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
@Dependent
public class AlbumDao {

    @Inject
    EntityManager em;

    public List<Album> getAllAlbums() {
        return em.createQuery("SELECT a FROM Album a LEFT JOIN fetch ", Album.class).getResultList();
    }
}
