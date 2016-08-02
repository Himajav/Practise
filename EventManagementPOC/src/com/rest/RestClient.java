package com.rest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class RestClient {
	String output=null;
	public String getProductData(String resourceName ) {
		
		 try {

				HttpURLConnection conn = callRestServices(resourceName);
				
				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}
				
				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));				
				
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				conn.disconnect();

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  }
		return output;

			}

	public static HttpURLConnection callRestServices(String resourceurl) throws MalformedURLException, IOException, ProtocolException {
		URL url = new URL(resourceurl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		
		conn.setRequestProperty("Accept", "application/json");
		return conn;
	}

}
