package Hello;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Random;

@WebService
@SOAPBinding()
public class HelloWorld {
	private static final Logger LOG = Logger.getLogger(HelloWorld.class.getName());

	@WebMethod
	public String say(@WebParam(name = "name6") String name5) {
		LOG.info("Web service is called!");
		return String.format("HelloHELLO, %s!", name5);
	}

	public int getUniekGetal(@WebParam(name = "adresId") int adres, @WebParam(name = "klantNaam") String klant,
			@WebParam(name = "bedrag") int bedrag) {
		LOG.info("AdresID: " + adres + "\n Van: " + klant + "\nBedrag: " + bedrag);
		Random rand = new Random();
		int uniekGetal = rand.nextInt(99999) + 1;
		return uniekGetal;
	}
}