import org.junit.*;
import static org.junit.Assert.*;

public class TestMain {
    public static Main main;

    @BeforeClass
    public static void oneTimeSetup() {
        System.out.println("Start");
    }

    @Before
    public void setup() {
        main = new Main();
    }

    @After
    public void tearDown() {
        main = null;
    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("Quit");
    }
     @Test
    public void testMainConstructor() {
         assertNotEquals(main, null);
     }

    @Test
    public void testAdd() {
        assertEquals( 4, main.add(2,2));
        assertEquals( 10, main.add(6,4));
        assertEquals( 10, main.add(4,6));
        assertEquals( 100, main.add(41,59));
        assertEquals( -10, main.add(-4,-6));
        assertEquals( -4, main.add(2,-6));
    }

    @Test
    public void testSub() {
        assertEquals( 0, main.sub(2,2));
        assertEquals( -6, main.sub(2,8));
        assertEquals( 6, main.sub(10,4));
        assertEquals( -4, main.sub(-2,2));
        assertEquals( 0, main.sub(-2,-2));
    }

    @Test
    public void testMul() {
        assertEquals( 4, main.mul(2,2));
        assertEquals( 15, main.mul(5,3));
        assertEquals( -15, main.mul(5, -3));
        assertEquals( 12, main.mul(-3,-4));
        assertEquals( 0, main.mul(5,0));
    }

    @Test
    public void testDiv() {
        assertEquals( 1, main.div(2,2));
        assertEquals( 2, main.div(10,5));
        assertEquals( -2, main.div(-10,5));
        assertEquals( -2, main.div(10,-5));
        assertEquals( 10, main.div(-100,-10));
    }
}
