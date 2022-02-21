package com.example.configurationTestNested;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
  value = "classpath:configprops.json", 
  factory = JsonPropertySourceFactory.class)
@ConfigurationProperties
public class JsonProperties {

	private int port;
	private boolean resend;
    private String host;
    private String[] symbols;
    private LinkedHashMap<String,?> sender;
    
    public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public boolean isResend() {
			return resend;
		}

		public void setResend(boolean resend) {
			this.resend = resend;
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String[] getSymbols() {
			return symbols;
		}

		public void setSymbols(String[] symbols) {
			this.symbols = symbols;
		}

		

		public LinkedHashMap<String, ?> getSender() {
			return sender;
		}

		public void setSender(LinkedHashMap<String, ?> sender) {
			this.sender = sender;
		}

		@Override
		public String toString() {
			return "JsonProperties [port=" + port + ", resend=" + resend + ", host=" + host + ", symbols="
					+ Arrays.toString(symbols) + ", sender=" + sender + "]";
		}

}