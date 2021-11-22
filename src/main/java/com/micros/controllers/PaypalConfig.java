package com.micros.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;

@Configuration
public class PaypalConfig {

	@Value("${paypal.client.id}")
	private String clientId;
	@Value("${paypal.client.secret}")
	private String clientSecret;
	@Value("${paypal.mode}")
	private String mode;
	
	@Bean
	public Map<String, String> paypalSdkConfig(){
		Map<String, String> configMap = new HashMap<>();
		configMap.put("mode", this.mode);
		return configMap;
	}
	
	@Bean
	public OAuthTokenCredential oAuthTokenCredential() {
		return new OAuthTokenCredential(this.clientId, this.clientSecret,paypalSdkConfig());
	}
	
	@Bean
	public APIContext apiContext() throws PayPalRESTException {
		APIContext apiContext = new APIContext(oAuthTokenCredential().getAccessToken());
		apiContext.setConfigurationMap(paypalSdkConfig());
		return apiContext;
	}
	
	
}
