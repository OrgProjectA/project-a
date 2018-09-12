package com.cicd.projecta.repository;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public abstract class RestBuilder {

  // TODO THis should not be in production since this ignore all CERTIFICATION verification.
  public RestTemplate build(RestTemplateBuilder restTemplateBuilder) {
    RestTemplate requestTemplate = null;
    try {
      TrustStrategy acceptingTrustStrategy = (X509Certificate[] x509Certificates, String s) -> true;

      SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
          .loadTrustMaterial(null, acceptingTrustStrategy).build();
      SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext,
          new NoopHostnameVerifier());
      CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
      HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
      requestFactory.setHttpClient(httpClient);

      requestTemplate = new RestTemplate(requestFactory);
    } catch (Exception e) {
//       TODO catch these: KeyStoreException, NoSuchAlgorithmException, KeyManagementException
      System.out.println("restTemplate issue.");
    }
    return requestTemplate;
//    return restTemplateBuilder.requestFactory(requestFactory).errorHandler(new RestTemplateResponseErrorHandler())
//        .build();
  }
}
