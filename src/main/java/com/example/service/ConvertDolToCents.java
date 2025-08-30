package com.example.service;

import com.example.interfaces.Convertor;

public class ConvertDolToCents implements Convertor {

  @Override
  public int convert(int concurrency) {
    return concurrency * 100;
  }
}
