package com.revature.revspace.services;

import com.revature.revspace.models.Credentials;
import com.revature.revspace.models.User;
import com.revature.revspace.repositories.CredentialsRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = com.revature.revspace.app.RevSpaceWebServiceApplication.class)
public class CredentialsServiceTest {

    @Autowired
    CredentialsService credentialsService;

    @MockBean
    CredentialsRepo credentialsRepo;

    @Test
    void getByEmail(){
        User user = new User("abc@email.com", "name","name", 8708779L, 234243234L, "git", "title", "location", "aboutme");
        Credentials credentials = new Credentials(user, "password");

        Mockito.when(credentialsRepo.findByUserEmail(user.getEmail())).thenReturn(credentials);
        Credentials actual = credentialsService.getByEmail(user.getEmail());
        assertEquals("abc@email.com", actual.getUser().getEmail());
    }
}
