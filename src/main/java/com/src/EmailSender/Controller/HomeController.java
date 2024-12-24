package com.src.EmailSender.Controller;

import com.src.EmailSender.DTO.EmailDTO;
import com.src.EmailSender.Models.User;
import com.src.EmailSender.Services.EmailServiceImpl;
import com.src.EmailSender.Services.UserService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmailServiceImpl emailService;

    @GetMapping("/")
    public String home() {
        return "Welcome Abhay!!";
    }

    @PostMapping("/EmailSender")
    public void EmailSender(@RequestBody EmailDTO emailDTO) {
        emailService.sendEmail(emailDTO.getTo(), emailDTO.getSubject(), emailDTO.getMessage());
    }

    @PostMapping("/EmailSenderWithHtml")
    public void EmailSenderWithHTML(@RequestBody EmailDTO emailDTO) throws MessagingException {
        emailService.sendEmailWithHtml(emailDTO.getTo(), emailDTO.getSubject(), emailDTO.getHtmlContent());
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.verify(user);
    }
}
