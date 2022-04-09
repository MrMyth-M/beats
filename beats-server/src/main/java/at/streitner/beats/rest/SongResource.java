package at.streitner.beats.rest;

import at.streitner.beats.dao.SongDAO;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Path("/song")
public class SongResource {

    @Inject
    SongDAO songDAO;

    @GET
    @Path("/all")
    public Response getAllSongs() {
        return Response.ok(songDAO.getAllSongs()).build();
    }

    @GET
    @Path("/album/{id}")
    public Response getSongsFromAlbum(@PathParam("id") int albumId) {
        return Response.ok(songDAO.getSongsFromAlbum(albumId)).build();
    }
}
