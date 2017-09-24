package com.cudnik.chat.message.service;

import com.cudnik.chat.message.entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
}
