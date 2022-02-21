package com.example.configurationTestNested;

import java.io.IOException;
import java.util.Map;

import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SymbolFileSourceFactory implements PropertySourceFactory {
	
  @Override
  public PropertySource<?> createPropertySource(
    String name, EncodedResource resource)
        throws IOException {
	  Map<String,Object> readValue = new ObjectMapper()
        .readValue(resource.getInputStream(), Map.class);
      return new MapPropertySource("symbol-file", readValue);
  }
}