package copyFileMultithreading;

import java.io.File;

/**
 * Created by Fan on 2017/3/12.
 */
public class CopyManager {

    private String origin;
    private String destination;
    private int blockCount;
    private int blockSize;

    public CopyManager(String origin, String destination, int blockCount) {
        this.origin = origin;
        this.destination = destination;
        this.blockCount = blockCount;
        long fileSize = new File(origin).length();
        this.blockSize = ((int)fileSize) / blockCount;
    }

    public void excute() {
        for (int i = 0; i < blockCount; i++) {
            CopyProcess copyProcess = new CopyProcess(origin, destination, i * blockSize, blockSize);
            new Thread(copyProcess).start();
        }
    }
}
