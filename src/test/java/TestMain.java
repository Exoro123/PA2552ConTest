import org.junit.Test;

import static org.junit.Assert.*;
public class TestMain {
    public Main main;

     @Test
    public void testMainConstructor() {
         main = new Main();
         assertNotEquals(main, null);
     }

     @Test
    public void testAdd() {
         main = new Main();
         assertEquals( 4, main.add(2,2));
     }
}
