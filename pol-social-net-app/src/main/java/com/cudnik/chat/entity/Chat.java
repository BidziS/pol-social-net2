package com.cudnik.chat.entity;

import com.cudnik.base.entity.BaseEntity;
import com.cudnik.chat.message.entity.Message;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Bidzis on 9/9/2017.
 */
@Entity
@Table(name = "chats")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_CHAT_ID")
public class Chat extends BaseEntity {

//    @OneToMany(mappedBy = "chats", cascade = CascadeType.ALL)
//    private Set<UserDetails> users;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "chat", cascade = CascadeType.ALL)
    private Set<Message> messages;

    public Chat() {
    }

    public Chat(Set<Message> messages) {
        this.messages = messages;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
}
