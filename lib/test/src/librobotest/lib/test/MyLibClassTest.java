package librobotest.lib.test;

import librobotest.lib.MyLibClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MyLibClassTest {
  @Test
  public void testSum() throws Exception {
    Assert.assertEquals(3, MyLibClass.sum(1, 1));
  }
}
