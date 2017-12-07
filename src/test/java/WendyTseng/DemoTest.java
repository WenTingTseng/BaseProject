package WendyTseng;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void add() throws Exception {
        Demo d=new Demo();

        int result=d.Add(1,2);

        Assert.assertEquals(excepted,3,d);
    }

}
