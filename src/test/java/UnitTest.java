import oopCalc.HeadClass;
import org.junit.Test;

import static oopCalc.HeadClass.*;
import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void CheckSumDouble() {
        HeadClass sum;
        sum = new HeadClass(34.7, -2.7);
        assertEquals("Сложение считается неверно", 32, sum.summation(), 0);
    }

    @Test
    public void CheckSubDouble() {
        HeadClass sub;
        sub = new HeadClass(9.8, -1.2);
        assertEquals("Вычитание считается неверно", 11, sub.substraction(), 0);
    }

    @Test
    public void CheckMultDouble() {
        HeadClass mult;
        mult = new HeadClass(3.33, 3);
        assertEquals("Умножение считается неверно", 9.99, mult.multiplication(), 0);
    }

    @Test
    public void CheckDivDouble() {
        HeadClass div;
        div = new HeadClass(45, 3);
        assertEquals("Деление считается неверно", 15, division(), 0);
    }
    @Test
            (expected = ArithmeticException.class)
    public void DivisionTestForZero(){
        setX(8);
        setY(0);
        assertEquals("Ошибка деления на ноль", HeadClass.division());
    }
}