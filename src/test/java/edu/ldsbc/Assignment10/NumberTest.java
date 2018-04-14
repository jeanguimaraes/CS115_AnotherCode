package edu.ldsbc.Assignment10;
import org.junit.Test;
public class NumberTest {

    @Test
    public void pushWithNotFullQueueTest() throws Exception {
        NumberController numberController1 = new NumberController();

        int[] shouldBeInteger = {9,8,7,6,5,4,3,2,1,0};
        for(int i=0; i<10; i++) {
            numberController1.pushNumber(i);

        }
        numberController1.reverseQueue();
        int index = 0;

        for(int i=0; i<10; i++) {
            assert numberController1.getQueue()[i] == shouldBeInteger[i];
        }
    }

    @Test(expected = IllegalStateException.class)
    public void pushWithFullQueueTest() throws Exception {
        NumberController numberController1 = new NumberController();
        for(int i=0; i<=10; i++) {
            numberController1.pushNumber(i);
        }
    }

    @Test
    public void popWithAtLeastOneValueInQueueTest() throws Exception {
        NumberController numberController1 = new NumberController();

        for(int i=0; i<10; i++) {
            numberController1.pushNumber(i);

        }
        numberController1.popNumber();
    }

    @Test(expected = IllegalStateException.class)
    public void popWithEmptyQueueTest() throws Exception {
        NumberController numberController1 = new NumberController();

        numberController1.popNumber();
    }

}
