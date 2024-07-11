package org.emsi.platformarch;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@EnableFeignClients
public class PlatformArchApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PlatformArchApplication.class, args);

		InputStream serviceAccountStream = PlatformArchApplication.class.getClassLoader().getResourceAsStream("serviceAccountKey.json");

		//FileInputStream serviceAccount =new FileInputStream("src/main/resources/static/accountKey.json");

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccountStream))
				.build();
		FirebaseApp.initializeApp(options);
		Firestore db = FirestoreClient.getFirestore();
	}
	@Bean
	CommandLineRunner start(){
		return args -> {

		};
	}



}
