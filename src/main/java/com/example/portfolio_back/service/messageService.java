package com.example.portfolio_back.service;

import com.example.portfolio_back.model.Message;
import com.example.portfolio_back.dao.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class messageService {

    @Autowired
     MessageDao messageDao;

    public ResponseEntity<Message> sendMessage(Message model){
        try{
            return new ResponseEntity<>(messageDao.save(model),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Message(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Message>> getAllMessage() {
        try {
            return new ResponseEntity<>(messageDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteMessageById(int id) {
        try{
            messageDao.deleteById(id);
            return new ResponseEntity<>("succesfull",HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("unsuccesfull",HttpStatus.BAD_REQUEST);
    }
}
