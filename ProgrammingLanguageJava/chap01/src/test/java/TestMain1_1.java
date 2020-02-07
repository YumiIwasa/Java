import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain1_1 {
    @Test
    public void testHello() {
        Main1_1 main1_1 = new Main1_1();
        assertThat(main1_1.message(), is("Hello, world"));
    }


}
