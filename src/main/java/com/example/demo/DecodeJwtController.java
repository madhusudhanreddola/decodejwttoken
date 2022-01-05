package com.example.demo;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class DecodeJwtController {
	
	
	@GetMapping("decodejwt")
	public String decodeJwt(
			@RequestParam String token) {
		System.out.println(token);
		String[] chunks = token.split("\\.");
		Base64.Decoder decoder = Base64.getUrlDecoder();
		String header = new String(decoder.decode(chunks[0]));
		//response += "<br> Header is : "+header+" \n\n";
		String payload = new String(decoder.decode(chunks[1]));
		//response += "<br> Payload is : "+payload+" <br>";
		System.out.println(this.toString());
		DecodedToken dec_token = new Gson().fromJson(payload, DecodedToken.class);
		return dec_token.toString();
	}
	
}
