/**
 *
 */
package com.acc.util;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/**
 * @author BABUJI
 *
 */
public class InstagramClient
{

	public String getProfilePicOfUser(final String code)
	{

		/*
		 * String profilePic = null;
		 * 
		 * 
		 * try { final URL url = new URL("https://api.instagram.com/oauth/access_token"); final HttpURLConnection
		 * connection = (HttpURLConnection) url.openConnection(); connection.setDoOutput(true);
		 * connection.setRequestMethod("POST"); final String urlParameters = "client_id=e580d04d0687403189f86d49545b69a4"
		 * + "&client_secret=a2943297f601402d894f8d21400bdfd5" + "&grant_type=authorization_code" +
		 * "&redirect_uri=http://electronics.local:9001/yacceleratorstorefront/electronics/en/facerecognitionpage" +
		 * "&code=" + code;
		 * 
		 * connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		 * connection.setRequestProperty("charset", "utf-8"); connection.setRequestProperty("Content-Length", "" +
		 * Integer.toString(urlParameters.getBytes().length)); final DataOutputStream wr = new
		 * DataOutputStream(connection.getOutputStream()); wr.writeBytes(urlParameters); wr.flush(); wr.close();
		 * 
		 * final BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream())); final
		 * StringBuffer result = new StringBuffer(); String line = ""; while ((line = rd.readLine()) != null) {
		 * result.append(line); } System.out.println(result.toString());
		 * System.out.println("Output Json from Instagram is " + result); profilePic = processJson(result.toString()); }
		 * catch (final MalformedURLException e) { // YTODO Auto-generated catch block e.printStackTrace(); } catch (final
		 * IOException e) { // YTODO Auto-generated catch block e.printStackTrace(); } return profilePic;
		 */
		String profilePic = null;
		final String inputJson = "client_id=e580d04d0687403189f86d49545b69a4&client_secret=a2943297f601402d894f8d21400bdfd5&grant_type=authorization_code&redirect_uri=http://localhost:8081/FacebookProject/instagram_js.jsp&code="
				+ code;
		//String inputJson1 = "{\"Identities\": [{\"Score\": \"99.99986\",\"IdentityDetails\": {\"BiographicData\": [{\"Key\": \"Name\",\"Value\": \"Ravi\"},{\"Key\": \"ID\",\"Value\": \"DRIVING_LICENSE_ID\"}],\"BiometricDatas\": [{\"Base64Data\": \"/9j/4AAQSkZJ\",\"Modality\": \"Face_Face2D\",\"Type\": \"Image\"}],\"IdentityId\": \"BiometricDev[1:S:58840];\"}}],\"InWatchList\": false}";
		System.out.println(inputJson);

		// Make Web Service Call

		final Client client = ClientBuilder.newClient();

		final String instagramOutputJson = client.target("https://api.instagram.com/oauth/access_token").request()
				.method("POST", Entity.entity(inputJson, MediaType.APPLICATION_JSON), String.class);

		System.out.println("Output Json from Instagram is " + instagramOutputJson);

		profilePic = processJson(instagramOutputJson);

		return profilePic;

	}


	private String processJson(final String instagramOutputJson)
	{

		String profilePic = null;

		final JSONParser instagramOutputJsonParser = new JSONParser();
		try
		{

			final JSONObject instagramOutputJsonObject = (JSONObject) instagramOutputJsonParser.parse(instagramOutputJson);
			final JSONObject instagramUser = (JSONObject) instagramOutputJsonObject.get("user");
			profilePic = (String) instagramUser.get("profile_picture");

		}
		catch (final ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return profilePic;
	}
}