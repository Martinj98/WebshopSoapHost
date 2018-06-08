package Hello;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Random;

import java.io.*;
import java.util.concurrent.TimeUnit;
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
			@WebParam(name = "bedrag") int bedrag) throws InterruptedException {
		LOG.info("AdresID: " + adres + "\n Van: " + klant + "\nBedrag: " + bedrag);
		Random rand = new Random();
		int uniekGetal = rand.nextInt(99999) + 1;
		LOG.info("Waiting 30 sec start!");
		TimeUnit.SECONDS.sleep(30);
		LOG.info("Waiting 30 sec is over!");
		return uniekGetal;
	}
}
