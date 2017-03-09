package list;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Fan on 2017/2/20.
 */
public class FanArrayListTest {

    FanArrayList<Integer> integerFanArrayList;
    int initCapacity = 5;
    int defaultCapacity = 10;

    @org.junit.Before
    public void setUp() throws Exception {
        integerFanArrayList = new FanArrayList(initCapacity);
        Assert.assertEquals(5, integerFanArrayList.getCapacity());
        integerFanArrayList = new FanArrayList();
        Assert.assertEquals(defaultCapacity, integerFanArrayList.getCapacity());
    }

    @org.junit.Test
    public void add() throws Exception {
        int a = 1;
        Assert.assertEquals(1, a);
    }

}