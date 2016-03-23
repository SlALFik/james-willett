import org.junit.*;

/**
 * Created by vkharitonov on 21.03.2016.
 */
public class JunitBasics {
    @BeforeClass
    public static void beforeClassTest()
    {
        System.out.println("This code is executed once, at the start of the test run");
    }
    @Before
    public void beforeTest()
    {
        System.out.println("This code is executed BEFORE each and every test.");
    }
    @Test
    public void testOne()
    {
        System.out.println("This is test one!");
    }
    @Test
    public void testTwo()
    {
        System.out.println("This is test two!");
    }
    @Test
    public void testThree()
    {
        System.out.println("This is test three!");
    }
    @After
    public void afterTest()
    {
        System.out.println("This code is executed AFTER each and every test.");
    }
    @AfterClass
    public static void afterClassTest()
    {
        System.out.println("This code is executed once, at the end of the test run");
    }
}