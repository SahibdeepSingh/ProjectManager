package com.app.projectmanager.rest;

import com.app.projectmanager.services.SendEmailService;
import com.fasterxml.jackson.databind.JsonNode;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectManagementController {

    @Autowired
    public SendEmailService sendEmailService;

    @PostMapping("/test")
    public String sendEmail(@RequestBody JsonNode node){
        sendEmailService.sendEmail(node.get("to").asText(), node.get("subject").asText(), node.get("text").asText());
        return "Sending Email to" + node.get("to").asText();
    }
}
