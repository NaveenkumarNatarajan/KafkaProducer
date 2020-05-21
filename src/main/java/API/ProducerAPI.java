package API;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;

import Producer.KProducer;

@Path("api.tms.service.kafka/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProducerAPI {
	
	@POST
	@Path("/publishCommunication")
	public Response publishCommunication(String communication) throws JsonProcessingException {
		
		KProducer.produce("CommunicationTopic", communication);
		
		return Response.status(Response.Status.CREATED).entity("success").type(MediaType.TEXT_PLAIN).build();
	}
}
