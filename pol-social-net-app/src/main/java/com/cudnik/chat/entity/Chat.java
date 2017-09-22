package com.cudnik.chat.entity;

import com.cudnik.base.entity.BaseEntity;
import com.cudnik.chat.message.Message;
import com.cudnik.user.UserDetails;
import sun.rmi.log.LogInputStream;

import javax.persistence.*;
import java.util.List;
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

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private Set<Message> messages;
}
