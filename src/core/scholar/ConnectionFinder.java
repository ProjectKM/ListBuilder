/**
 * 
 */
package core.scholar;

import java.io.IOException;
import java.util.ArrayList;

import core.web.webGrabber;
import dataContainer.Person;

/**
 * @author ing. R.J.H.M. Stevens
 *
 */
public class ConnectionFinder {
	private final static String colleaguesBaseUrl = "https://scholar.google.nl/citations?view_op=list_colleagues&hl=nl&user=";
	
	private static String getData(String url){
		try {
			return webGrabber.UrlToString(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static ArrayList<Person> getPersonsToConnections(String scholarId){
		ArrayList<Person> connections = new ArrayList<Person>();
		String userUrl = colleaguesBaseUrl + scholarId;
		String data = getData(userUrl);
		data = clearColleageData(data);
		while (data != null)
		{
			data = removeColleage(data);
			if (data == null )
				break;
			Person person = new Person(grabName(data), grabGoogleId(data), grabUni(data));
			connections.add(person);
		}
		return connections;
	}
	
	private ArrayList<Person> grabConnections(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String removeColleage(String data){
		String openNameElement = "<div class=\"gsc_1usr gs_scl\">";
		String closeNameElement = null;
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	private static String clearColleageData(String data){
		String openNameElement = "<div id=\"gs_ccl\" role=\"main\">";
		String closeNameElement = "</html>";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	private static String grabName(String data){
		String openNameElement = "<h3 class=\"gsc_1usr_name\">";
		String closeNameElement = "</h3>";
		String tempData = grabDataFromString(data, openNameElement, closeNameElement);
		
		openNameElement = "alt=\"";
		closeNameElement = "\">";
		tempData = grabDataFromString(data, openNameElement, closeNameElement);
		//System.err.println(dotIndex);
		return tempData;
	}
	
	private static String grabGoogleId(String data){
		String openNameElement = "<a href=\"/citations?user=";
		String closeNameElement = "&";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	private static String grabUni(String data){
		String openNameElement = "<div class=\"gsc_1usr_emlb\">@";
		String closeNameElement = "</div>";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	
	private static String grabDataFromString(String data, String openTag, String closeTag){
		int startIndex = data.indexOf(openTag);
		if(startIndex == -1){
			return null;
		}
		startIndex += openTag.length();
		String tempData = data.substring(startIndex);
		if (closeTag != null){
			int stopIndex = tempData.indexOf(closeTag);
			return tempData.substring(0, stopIndex);
		}
		return tempData;
	}
	
	

}
