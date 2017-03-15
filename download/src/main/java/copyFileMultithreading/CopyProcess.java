package copyFileMultithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Fan on 2017/3/12.
 */
public class CopyProcess implements Runnable{

    private static final byte[] buffer = new byte[5];

    private String origin;
    private String destination;
    private int startPos;
    private int writeLen;

    public CopyProcess(String origin, String destination, int startPos, int writeLen) {
        this.origin = origin;
        this.destination = destination;
        this.startPos = startPos;
        this.writeLen = writeLen;
    }

    @Override
    public void run() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(origin);
            fileInputStream.skip(startPos);
            int currentLen = 0;
            int readLen = 0;
            fileOutputStream = new FileOutputStream(destination);
            while((readLen = fileInputStream.read(buffer)) > 0 && currentLen < writeLen) {
                fileOutputStream.write(buffer, startPos, readLen);
                currentLen += readLen;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
