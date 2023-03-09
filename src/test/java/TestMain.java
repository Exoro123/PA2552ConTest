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



}
