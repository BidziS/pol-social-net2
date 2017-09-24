package com.cudnik;

import com.cudnik.chat.entity.Chat;
import com.cudnik.chat.message.entity.Message;
import com.cudnik.chat.message.repository.MessageRepository;
import com.cudnik.chat.repository.ChatRepository;
import com.cudnik.user.user_details.entity.UserDetails;
import com.cudnik.user.user_details.repository.UserDetailsRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@SpringBootApplication
public class PolSocialNetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolSocialNetApplication.class, args);
	}


	@Bean
	@Transactional
	public CommandLineRunner init(MessageRepository messageRepository, UserDetailsRepository userDetailsRepository, ChatRepository chatRepository){

		UserDetails userDetails = new UserDetails("Daniel", "Cudnik");
		userDetailsRepository.save(userDetails);



		Chat chat = new Chat();
		chatRepository.save(chat);

		Message message = new Message(userDetailsRepository.findOne((long) 1),new Date(), "Message", chat);
		messageRepository.save(message);

		Set<Message> messages = new HashSet<Message>();
		messages.add(message);
		chat.setMessages(messages);
		chatRepository.save(chat);


		List<Chat> chats = chatRepository.findAll();

		return null;
	}
}

