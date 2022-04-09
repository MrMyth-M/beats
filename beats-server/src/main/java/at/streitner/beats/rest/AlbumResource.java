package at.streitner.beats.rest;

import at.streitner.beats.dao.AlbumDAO;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/album")
@Produces(MediaType.APPLICATION_JSON)
@Transactional
public class AlbumResource {

    @Inject
    AlbumDAO albumDao;

    @Path("/all")
    @GET
    public Response getAllAlbums() {
        return Response.ok(albumDao.getAllAlbums()).build();
    }
}
