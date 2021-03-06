import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloService {

	@Inject Hello2Service hello2Service;
	
	@GET
	@Produces("text/html")
	public String sayHello(){
		return "hello";
	}
	
	@Path("/2")
	public Hello2Service hello2service(){
		return hello2Service;
	}
	

	
}
