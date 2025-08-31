package com.example;

import com.example.service.ServiceDolToCents;
import com.example.utils.DependencyContainer;

public class DolToCentsApp {

  private final ServiceDolToCents service;

  public DolToCentsApp(ServiceDolToCents service) {
    this.service = service;
  }

  private void run() {
    service.runService();
  }

  public static void main(String[] args) {
    DependencyContainer container = new DependencyContainer();

    DolToCentsApp app = new DolToCentsApp(container.getServiceDolToCents());

    app.run();
  }
}
