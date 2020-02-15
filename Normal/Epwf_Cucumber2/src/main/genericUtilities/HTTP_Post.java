package genericUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;

public class HTTP_Post extends GlobalVariables {
	
	
	/*// Get XML from text file and set it in a String variable
	public void setXMLStringValue(String XMLFilePath)
			throws FileNotFoundException {
		XMLFile = new File(XMLFilePath);

		XMLFileReader = new Scanner(new FileReader(XMLFile));
		XMLString ="";
		while (XMLFileReader.hasNext()) {
			XMLString = XMLString
					+ XMLFileReader.next() + "\n";
		}
		
	}

	// created a trusted certificate for the HTTP POST connection
	public void createTrustedCertificate()
			throws KeyManagementException, NoSuchAlgorithmException {
		

		sslContext = SSLContext.getInstance("SSL");
		
		sslContext.init(null,
				new TrustManager[] { new X509TrustManager() {
					public X509Certificate[] getAcceptedIssuers() {
						return null;
					}

					public void checkClientTrusted(X509Certificate[] certs,
							String authType) {
					}

					public void checkServerTrusted(X509Certificate[] certs,
							String authType) {
					}
				}
			}, new SecureRandom());
		
	}

	// set the http client with trusted certificate
	@SuppressWarnings("deprecation")
	public void setHttpClient() {               
		
		httpXMLRunner = HttpClients
				.custom()
				.setSSLSocketFactory(
						new SSLSocketFactory(sslContext))
				.build();
	}*/

	// set the HTTP POST variable to run the request
	public void setHTTPPost() {

		httpXMLPoster = new HttpPost(ex_WSDL);

		httpXMLPoster.setHeader("Content-type",
				"application/xml");
		
		httpXMLPoster.setHeader("Accept", "application/xml");
		
		postDataEntity = new ByteArrayEntity(
				reqXML.getBytes());
		postDataEntity.setChunked(true);
		httpXMLPoster.setEntity(postDataEntity);
		
	}

	// send an HTTP POST request
	public void sendHTTPPostRequest() throws ClientProtocolException,
			IOException {
		
		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("MobMyaCxg7","ui5TD_K;ebZ&");
		provider.setCredentials(AuthScope.ANY,credentials);
		HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
		
		response = client.execute(httpXMLPoster);
		System.out.println("Response Code : "
		                + response.getStatusLine().getStatusCode());
		/*httpXMLResponseReciever = httpXMLRunner
				.execute(httpXMLPoster);*/
	}

	// convert the response into readable string format
	public String formatResponseToString() throws IOException {
		try {
			responseConverter = response
					.getEntity();
			/*responseConverter = httpXMLResponseReciever
					.getEntity();*/
			responseXML = EntityUtils
					.toString(responseConverter);
			EntityUtils.consume(responseConverter);
		}catch(Exception e){
			System.out.println("request me gadbad hain");
		}/*finally {
			 response.close();
		}*/
		//commonClass.WTFXMLResponse(GlobalVariables.writerObject,
				//GlobalVariables.WTFile, GlobalVariables.responseResult);
		
		return responseXML;
	}

	// jsoup verify if response is successful
	public String getTagValue(String tagName) {
		
		jsoupParserResponse = Jsoup.parse(responseXML, "", Parser.xmlParser());
		return jsoupParserResponse.select(tagName).text();
		
	}
	
	public String getTagValueFromRequestXML(String tagName){
		
		jsoupParserRequest = Jsoup.parse(GlobalVariables.XMLString,"",Parser.xmlParser());
		return jsoupParserRequest.select(tagName).text();
		
	}
	
}
