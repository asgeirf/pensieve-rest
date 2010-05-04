import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
@RequestScoped
@Named
public class HelloService {

	@GET
	@Produces("text/html")
	public String sayHello(){
		return "hello";
	}
	
}
