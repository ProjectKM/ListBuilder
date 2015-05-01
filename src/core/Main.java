/**
 * 
 */
package core;

import java.io.IOException;
import java.util.ArrayList;

import core.scholar.ConnectionFinder;
import core.web.webGrabber;
import dataContainer.Person;

/**
 * @author ing. R.J.H.M. Stevens
 *
 */
public class Main {
	
	/**
	 * 
	 */
	public Main() {
		ArrayList<Person> results =  ConnectionFinder.getPersonsToConnections("3TofHnIAAAAJ");
		String[] email = new String[1];
		email[0] = "maastrichtuniversity.nl";
		new PersonManager(results, email);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();

	}

}
