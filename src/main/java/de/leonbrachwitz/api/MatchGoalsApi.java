package de.leonbrachwitz.api;

import de.leonbrachwitz.config.EndpointConfigurator;
import de.leonbrachwitz.domain.match.MatchDetailsService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/match")
public class MatchGoalsApi {

    MatchDetailsService matchDetailsService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMatchGoals(@PathParam("id") int id) {
        EndpointConfigurator.runConfigForEndpoint("matchGoals");

        matchDetailsService = new MatchDetailsService();
        var match = matchDetailsService.getMatchResponse(id);

        return Response.ok(match).build();
    }
}
