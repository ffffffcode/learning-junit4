package ex.aaronfae.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * �׼����ɲ�����
 * 
 * @author AaronFae
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ Test1.class, Test2.class, Test3.class })
public class AllTests {

}
