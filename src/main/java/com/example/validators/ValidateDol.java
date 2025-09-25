package com.example.validators;

import com.example.interfaces.Validator;

public class ValidateDol implements Validator {

  @Override
  public boolean validate(String concurrency) {
    return concurrency.matches("^\\$?(?!0\\d)(?!-)(?!.*[,\\.])([1-9]\\d*|0)$");
  }
}
