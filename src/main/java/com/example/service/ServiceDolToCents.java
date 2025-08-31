package com.example.service;

import com.example.interfaces.Convertor;
import com.example.interfaces.Input;
import com.example.interfaces.Validator;

public class ServiceDolToCents {

  private final Input input;
  private final Convertor convertor;
  private final Validator validator;

  private static final String RESET = "\u001B[0m";
  private static final String RED = "\u001B[31m";
  private static final String GREEN = "\u001B[32m";

  public ServiceDolToCents(Input input, Convertor convertor, Validator validator) {
    this.input = input;
    this.convertor = convertor;
    this.validator = validator;
  }

  public void convertProcess() {
    try (Input ipnut = input) {

      String concurrency;

      while (true) {
        concurrency = input.getInput();

        if (validator.validate(concurrency)) {

          throwResult(convertor.convert(Integer.parseInt(concurrency)));

          break;
        } else {

          throwError(concurrency);
        }
      }
    }
  }

  private void throwResult(int result) {
    System.out.printf(GREEN + "\nThe result is: %d" + RESET, result);
  }

  private void throwError(String invalidInput) {
    System.out.printf(
        RED
            + "\nInvalid input: %s"
            + RESET
            + "\nYour string should:"
            + "\n- Contain only digits"
            + "\n- Contain only one '$' symbol in the end",
        invalidInput);
  }

  public void runService() {
    convertProcess();
  }
}
