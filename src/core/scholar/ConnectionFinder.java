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
	private final String userBaseUrl = "https://scholar.google.nl/citations?user=";
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	/**
	 * 
	 */
	public ConnectionFinder(String startString) {
		CreatePerson(startString);
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
	
	private void CreatePerson(String scholarId){
		String userUrl = userBaseUrl + scholarId;
		String data = getData(userUrl);
		String name = grabName(data);
		String university = grabUni(data);
		System.out.println(university);
	}
	
	private String grabName(String data){
		String openNameElement = "<div id=\"gsc_prf_in\">";
		String closeNameElement = "</div>";
		return grabDataFromString(data, openNameElement, closeNameElement);
	}
	
	private String grabUni(String data){
		String openNameElement = "<div class=\"gsc_prf_il\" id=\"gsc_prf_ivh\">";
		String closeNameElement = "</div>";
		String tempData = grabDataFromString(data, openNameElement, closeNameElement);
		
		int tempIndex = 0;
		while (true && tempData.indexOf(".") > 0)
		{
			tempIndex = tempData.indexOf(" ")+1;
			if (tempIndex < tempData.indexOf("."))
				tempData = tempData.substring(tempIndex);
			else
				break;
		}
		tempData = tempData.substring(0, tempData.indexOf("."));
		//System.err.println(dotIndex);
		return tempData;
	}
	
	private String grabDataFromString(String data, String openTag, String closeTag){
		int startIndex = data.indexOf(openTag);
		if(startIndex == -1)
			System.err.println("ERROR: grabName");
		startIndex += openTag.length();
		String tempData = data.substring(startIndex);
		int stopIndex = tempData.indexOf(closeTag);
		return tempData.substring(0, stopIndex);
	}
	
	

}
