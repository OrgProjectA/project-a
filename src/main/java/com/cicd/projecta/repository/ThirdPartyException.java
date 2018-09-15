package com.cicd.projecta.repository;

public class ThirdPartyException extends Exception {

  public ThirdPartyException(String message) {
    super(message);
  }

  public ThirdPartyException(String message, Throwable cause) {
    super(message, cause);
  }
}
