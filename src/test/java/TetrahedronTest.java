import org.junit.Test;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TetrahedronTest {

    @Test
    public void testCal() {
        double value1 = new TetrahedronSolution().cal(0.0);
        double value2 = new TetrahedronSolution().cal(0.33);
        BigDecimal bd1 = new BigDecimal(value1);
        BigDecimal bd2 = new BigDecimal(value2);
        bd1 = bd1.setScale(3, RoundingMode.HALF_UP);
        bd2 = bd2.setScale(3, RoundingMode.HALF_UP);

        Assertions.assertEquals("0.333", bd1.toString());
        Assertions.assertEquals("0.223", bd2.toString());
    }

}
