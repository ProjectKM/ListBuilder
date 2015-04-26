package core.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;


public final class webGrabber {
	
	public static String UrlToString(String encodedURL) throws IOException{
	URL url = new URL(encodedURL); 
	HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
	conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.12) Gecko/20060508 Firefox/1.5.0.4"); 
	
	int respcode = conn.getResponseCode(); 
	if (respcode == HttpURLConnection.HTTP_OK) { 
	    InputStream in = conn.getInputStream(); 

	    // check for gzip encoding and setup on-the-fly decoding if necessary 
	    String hdrFieldEnc = conn.getHeaderField("Content-Encoding"); 
	    if (hdrFieldEnc != null) { 
	        if (hdrFieldEnc.equals("gzip")) { 
	            in = new GZIPInputStream(in); 
	        } 
	    } 

	    BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
	    StringBuffer buf = new StringBuffer(); 
	    String line; 
	    while ((line = br.readLine()) != null) { 
	        buf.append(line); 
	    } 
	    
	    return buf.toString();
	    //createFile("testOutput.html", buf.toString()); 
	} else { 
	    // handle other response codes 
	}
	return null;
}
}