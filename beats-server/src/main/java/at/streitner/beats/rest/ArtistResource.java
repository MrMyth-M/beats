package at.streitner.beats.rest;

import at.streitner.beats.dao.ArtistDAO;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Transactional
@Path("/artist")
@Produces(MediaType.APPLICATION_JSON)
public class ArtistResource {

    @Inject
    ArtistDAO artistDao;

    @GET
    @Path("/all")
    public Response getAllArtist() {
        return Response.ok(artistDao.getAllArtist()).build();
    }

    @GET
    @Path("/allWithAlbum")
    public Response getAllArtistsWithAlbums() {
        return Response.ok(artistDao.getAllArtistWithAlbums()).build();
    }
}
