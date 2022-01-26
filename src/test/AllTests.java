package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Roman - rggeleta
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
@RunWith(Suite.class)
@SuiteClasses({ TestStudent.class, TestStudentEnrollmentLogic.class })
public class AllTests {

}
