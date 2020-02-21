import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {
    @Test
    public void addTest(){
        Calculator x = new Calculator();
        long actual = x.add(2,0);
        Assert.assertEquals(2,actual);
    }
    @Test
    public void addTest1(){
        Calculator x = new Calculator();
        long actual = x.add(2,-4);
        Assert.assertEquals(-2,actual);
    }
    @Test
    public void addTest2(){
        Calculator x = new Calculator();
        long actual = x.add(-5,-5);
        Assert.assertEquals(-10,actual);
    }
    @Test
    public void divideTest(){
        Calculator x = new Calculator();
        float actual = x.divide(5,-5);
        Assert.assertEquals(-1.0,actual,0.0);
    }
    @Test
    public void divideTest1(){
        Calculator x = new Calculator();
        float actual = x.divide(20,2);
        Assert.assertEquals(10.0,actual,0.0);
    }
    @Test
    public void divideTest2(){
        Calculator x = new Calculator();
        float actual = x.divide(1,-2);
        Assert.assertEquals(-0.5,actual,0.0);
    }
    @Test
    public void divideTest3(){
        Calculator x = new Calculator();
        float actual = x.divide(3000,1);
        Assert.assertEquals(3000.0,actual,0.0);
    }
    @Test(expected = RuntimeException.class)
    public void divideTest4(){
        Calculator x = new Calculator();
        x.divide(11,0);
    }
}
