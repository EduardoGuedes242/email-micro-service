package com.eduardoguedes.email.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

  @Autowired
  private EmailService emailService;

  @PostMapping("/send")
  public String sendEmail(@RequestBody Email email) {
    emailService.sendEmail(email);
    return "ok";
  }

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

}
