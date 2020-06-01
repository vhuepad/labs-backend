package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.model.Course;
import co.edu.unal.software_engineering.labs.pojo.CoursePOJO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith( MockitoJUnitRunner.class)
public class CourseServiceTest{

    @InjectMocks
    private CourseService courseService;


    public CourseServiceTest( ){ }


    @Test
    public void mapperCourseEntityTest( ){
        CoursePOJO pojo = new CoursePOJO( );
        pojo.setCourseName( "Course Test # 1" );
        pojo.setDurationHours( 400 );
        Course course = courseService.mapperCourseEntity( pojo );

        assertNotNull( course );
        assertNotNull( course.getCourseName( ) );
        assertNotNull( course.getDurationHours( ) );

        assertEquals( course.getCourseName( ), pojo.getCourseName( ) );
        assertEquals( course.getDurationHours( ), pojo.getDurationHours( ) );

    }

}