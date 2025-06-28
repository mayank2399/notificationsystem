package com.notification.system;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Service
public class Service {
//
//	@Value("${my.app.name}")
//	public String key;
//
//	public String mail() throws IOException {
//		String apiKey = key;
//
//		URL url = new URL("https://api.brevo.com/v3/smtp/email");
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.setRequestMethod("POST");
//		con.setRequestProperty("api-key", apiKey);
//		con.setRequestProperty("Content-Type", "application/json");
//		con.setDoOutput(true);
//
//		String json = """
//				{
//				 "sender": {"name":"JavaApp","email":"iammayank2399@gmail.com"},
//				 "to": [{"email":"mayanksinha2399@gmail.com"}],
//				 "subject":"Test Email",
//				 "htmlContent":"<html><body><h1>Hello from Java + Brevo!</h1></body></html>"
//				}
//				""";
//
//		try (OutputStream os = con.getOutputStream()) {
//			os.write(json.getBytes());
//			os.flush();
//		}
//
//		int responseCode = con.getResponseCode();
//		System.out.println("Response Code: " + responseCode);
//		return "Response Code: " + responseCode;
//	}
}
