/**
 * 
 */
package core;

import java.io.IOException;

import core.web.webGrabber;

/**
 * @author ing. R.J.H.M. Stevens
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("test");
		try {
			System.out.println(webGrabber.UrlToString("https://scholar.google.nl/citations?user=RL-mjvUAAAAJ&hl=nl"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test");

	}

}
