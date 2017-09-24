package com.cudnik.chat.controller;

import com.cudnik.chat.entity.Chat;
import com.cudnik.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bidzis on 9/9/2017.
 */
@RestController
@RequestMapping(value = "/chats")
public class ChatController {

    private ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Chat>> getAllBooks(){
        return new ResponseEntity<>(chatService.getAllChats(), HttpStatus.OK);
    }
}
