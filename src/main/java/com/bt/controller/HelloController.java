package com.bt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xk
 * @date 2022/12/15 15:48
 */
@RestController
public class HelloController {

  @GetMapping("/hello")
  public String getData() {
    return "Local Jenkins test";
  }

}
