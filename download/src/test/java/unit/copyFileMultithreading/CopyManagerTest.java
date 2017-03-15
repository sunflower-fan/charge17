package copyFileMultithreading;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Fan on 2017/3/15.
 */
public class CopyManagerTest {
    @Test
    public void excute() throws Exception {
        String origin = "E:\\code\\java\\charge17\\download\\src\\test\\resources\\a.txt";
        String destiation = "E:\\code\\java\\charge17\\download\\src\\test\\resources\\aCopy.txt";

        new CopyManager(origin, destiation, 2).excute();
    }

}