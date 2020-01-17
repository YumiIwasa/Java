import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class testCal {
    @Spy
    public Saikoro saikoro;
    @InjectMocks
    public Cal cal;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaikoro(){
        Mockito.when(saikoro.saiMock()).thenReturn(6);
        System.out.println(cal.caMock());
        System.out.println(cal.ca());
    }

    @Test
    public void testSaikoro1() {
        Mockito.when(saikoro.sai()).thenReturn(2);
        System.out.println(cal.ca());
    }

    @Test
    public void testSaikoro2() {
        Mockito.when(saikoro.sai()).thenReturn(2);
        System.out.println(cal.ca());
    }
}
