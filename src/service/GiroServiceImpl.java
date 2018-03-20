
package service;

import javax.jws.WebService;

import util.RandomNumberGeneratorImpl;
import util.UtilFacade;

@WebService
public class GiroServiceImpl implements GiroService{
	
	@Override
	public int generateAcceptGiro(String klantNaam, String adres, float bedrag) {
		// TODO Auto-generated method stub
		return (new UtilFacade().getRandomNumber());
	}

}
