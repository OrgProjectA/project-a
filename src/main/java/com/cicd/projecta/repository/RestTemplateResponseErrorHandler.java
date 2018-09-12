package com.cicd.projecta.repository;

import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus.Series;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

  public boolean hasError(ClientHttpResponse httpResponse) throws IOException {
    return ( httpResponse.getStatusCode().series() == Series.CLIENT_ERROR
        || httpResponse.getStatusCode().series() == Series.SERVER_ERROR);
  }

  @Override
  public void handleError(ClientHttpResponse httpResponse) throws IOException {
    if(httpResponse.getStatusCode().series() == Series.SERVER_ERROR) {
          System.out.println(httpResponse.getHeaders());
    } else if(httpResponse.getStatusCode().series() == Series.CLIENT_ERROR) {
      if(httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
        System.out.println(httpResponse.getHeaders());
      }
    }
  }
}


