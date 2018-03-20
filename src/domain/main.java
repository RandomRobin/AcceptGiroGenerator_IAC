package domain;

import javax.xml.ws.Endpoint;

import service.GiroServiceImpl;

public class main {
	public static void main(String[] args) {
		Endpoint.publish("https://acceptgirogenerator.herokuapp.com/getgiro", new GiroServiceImpl());
	}

}
