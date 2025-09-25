package com.example.service;

import com.example.interfaces.Input;
import java.util.Scanner;

public class InputDolToCents implements Input {

  private final Scanner scan;

  public InputDolToCents() { this.scan = new Scanner(System.in); }

  @Override
  public String getInput() {
    System.out.print("Enter the amount of dollars:");

    return scan.next();
  }

  @Override
  public void close() {
    scan.close();
  }
}
