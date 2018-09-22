import com.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/Bean.xml")
public class Jdbc2Test {


    @Autowired
    private UserDao userDao;

    @Test
    public void jdbc2Test(){
        userDao.findall();

    }


}
