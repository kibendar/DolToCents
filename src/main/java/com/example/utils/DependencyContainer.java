package com.example.utils;

import com.example.interfaces.Convertor;
import com.example.interfaces.Input;
import com.example.interfaces.Validator;
import com.example.service.ConvertDolToCents;
import com.example.service.InputDolToCents;
import com.example.service.ServiceDolToCents;
import com.example.validators.ValidateDol;

public class DependencyContainer {

  public Input getInput() {
    return new InputDolToCents();
  }

  public Convertor getConvertor() {
    return new ConvertDolToCents();
  }

  public Validator getValidator() {
    return new ValidateDol();
  }

  public ServiceDolToCents getServiceDolToCents() {
    return new ServiceDolToCents(getInput(), getConvertor(), getValidator());
  }
}
