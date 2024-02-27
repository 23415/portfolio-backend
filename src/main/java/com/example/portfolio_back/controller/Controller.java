package com.example.portfolio_back.controller;

import com.example.portfolio_back.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.example.portfolio_back.service.messageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    messageService messageService;

    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(@RequestBody Message message){
        return messageService.sendMessage(message);
    }

    @GetMapping("/getMessage")
    public ResponseEntity<List<Message>> getAllMessage(){
        return messageService.getAllMessage();
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<String> deleteMessageById(@PathVariable int id){
        return messageService.deleteMessageById(id);
    }
}
