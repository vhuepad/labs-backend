package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith( MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
    }

    @Test
    public void userTest() {
        String names = "Nombre";

        User user = new User( );
        user.setNames( names );
        user.setSurnames( names );
        user.setUsername( names );
        user.setPassword( names );
        userService.save( user );
        User findUser = userService.findByUsername( names );
        assertEquals( user, findUser );
    }
}