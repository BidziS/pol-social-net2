package com.cudnik.chat.service;

import com.cudnik.chat.entity.Chat;
import com.cudnik.chat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChatServiceImpl implements ChatService {

    private ChatRepository chatRepository;

    @Autowired
    public ChatServiceImpl(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }


    @Override
    public List<Chat> getAllChats() {
        List<Chat> chats = null;
        try{
            chats = chatRepository.findAll();
        } catch (Exception e){

        }

        return chats;
    }
}
