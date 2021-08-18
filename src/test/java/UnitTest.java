import oopCalc.HeadClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void CheckAddDouble() {
        HeadClass sum;
        sum = new HeadClass(34.7, -2.7);
        Assert.assertEquals("Сложение считается неверно", 32, sum.summation(), 0);
    }

    @Test
    public void CheckSubDouble() {
        HeadClass sub;
        sub = new HeadClass(9.8, -1.2);
        Assert.assertEquals("Вычитание считается неверно", 11, sub.substraction(), 0);
    }

    @Test
    public void CheckMultDouble() {
        HeadClass mult;
        mult = new HeadClass(3.33, 3);
        Assert.assertEquals("Умножение считается неверно", 9.99, mult.multiplication(), 0);
    }

    @Test
    public void CheckDivDouble() {
        HeadClass div;
        div = new HeadClass(45, 3);
        Assert.assertEquals("Деление считается неверно", 15, div.division(), 0);
    }
}