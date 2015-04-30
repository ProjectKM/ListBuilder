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
	private final String colleaguesBaseUrl = "https://scholar.google.nl/citations?view_op=list_colleagues&hl=nl&user=";
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	/**
	 * 
	 */
	public ConnectionFinder(String startString) {
		AddPersonsToConnections(startString);
	}
	
	private String getData(String url){
		try {
			return webGrabber.UrlToString(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	private void AddPersonsToConnections(String scholarId){
		String userUrl = colleaguesBaseUrl + scholarId;
		String data = getData(userUrl);
		data = clearColleageData(data);
		while (data != null)
		{
			data = removeColleage(data);
			if (data == null )
				break;
			System.out.println("name = "+grabName(data));
			System.out.println("id = "+grabGoogleId(data));
			System.out.println("uni  ="+grabUni(data));
			System.out.println("");
			
		}
	}
	
	private ArrayList<Person> grabConnections(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	private String removeColleage(String data){
		String openNameElement = "<div class=\"gsc_1usr gs_scl\">";
		String closeNameElement = null;
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	private String clearColleageData(String data){
		String openNameElement = "<div id=\"gs_ccl\" role=\"main\">";
		String closeNameElement = "</html>";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	private String grabName(String data){
		String openNameElement = "<h3 class=\"gsc_1usr_name\">";
		String closeNameElement = "</h3>";
		String tempData = grabDataFromString(data, openNameElement, closeNameElement);
		
		openNameElement = "alt=\"";
		closeNameElement = "\">";
		tempData = grabDataFromString(data, openNameElement, closeNameElement);
		//System.err.println(dotIndex);
		return tempData;
	}
	
	private String grabGoogleId(String data){
		String openNameElement = "<a href=\"/citations?user=";
		String closeNameElement = "&";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	private String grabUni(String data){
		String openNameElement = "<div class=\"gsc_1usr_emlb\">@";
		String closeNameElement = "</div>";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	
	private String grabDataFromString(String data, String openTag, String closeTag){
		int startIndex = data.indexOf(openTag);
		if(startIndex == -1){
			System.err.println("ERROR: grabName");
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
