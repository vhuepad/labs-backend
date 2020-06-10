package co.edu.unal.software_engineering.labs.service;
import co.edu.unal.software_engineering.labs.model.User;
import co.edu.unal.software_engineering.labs.pojo.RegisterUserPOJO;
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
    public void isRightUserTest() {
        String names = "Nombre";
        RegisterUserPOJO pojo = new RegisterUserPOJO();
        pojo.setNames( names );
        pojo.setSurnames( names );
        pojo.setUsername( names );
        pojo.setPassword( names );
        Boolean user = userService.isRightUser(pojo);
        assertEquals(true, user);
    }
}