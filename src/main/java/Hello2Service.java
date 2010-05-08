import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class Hello2Service {

	@GET
	@Produces("text/html")
	@Path("")
	public String sayHello(){
		return "hello 2";
	}
	
}
