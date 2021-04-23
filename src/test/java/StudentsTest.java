import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StudentsTest {

    @Test
    public void createStudentShouldReturnArraysWithLength4(){
        //GIVEN
        int numberStudents0 = 0;
        String [] expected0= {};
        int numberStudents4 = 4;
        String [] expected4 = {"Student 1","Student 2","Student 3","Student 4"};


        //WHEN
        String [] students4 = Students.createStudentsArray(numberStudents4);
        String [] students0 = Students.createStudentsArray(numberStudents0);

        //THEN
        assertArrayEquals(expected0, students0);
        assertArrayEquals(expected4, students4);


    }




}
