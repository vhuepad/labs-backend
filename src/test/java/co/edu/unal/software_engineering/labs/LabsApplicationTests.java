package co.edu.unal.software_engineering.labs;

import co.edu.unal.software_engineering.labs.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith( SpringRunner.class)
@SpringBootTest
public class LabsApplicationTests{


	@Test
	public void contextLoads( ){
		Course course = new Course( );
		assertNotNull( course );
	}

}