package com.cudnik.chat.message.entity;

import com.cudnik.base.entity.BaseEntity;
import com.cudnik.chat.entity.Chat;
import com.cudnik.user.user_details.entity.UserDetails;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Bidzis on 9/9/2017.
 */
@Entity
@Table(name = "messages")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_MESSAGE_ID")
public class Message extends BaseEntity {
    private UserDetails userDetails;
    private Date sendDate;
    private String message;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHAT_ID", nullable = false)
    private Chat chat;

    public Message() {
    }

    public Message(UserDetails userDetails, Date sendDate, String message) {
        this.userDetails = userDetails;
        this.sendDate = sendDate;
        this.message = message;
    }

    public Message(UserDetails userDetails, Date sendDate, String message, Chat chat) {
        this.userDetails = userDetails;
        this.sendDate = sendDate;
        this.message = message;
        this.chat = chat;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
