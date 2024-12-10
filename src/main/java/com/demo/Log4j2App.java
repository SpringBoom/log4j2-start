package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @since 2024/12/10
 */
public class Log4j2App {

  private static final Logger log = LogManager.getLogger(Log4j2App.class);

  public static void main(String[] args) {
    log.debug("Hello Log4j2 debug log");
    log.info("Hello Log4j2 info log");
  }

}
