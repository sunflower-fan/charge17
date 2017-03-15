import api.Connection;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadThread extends Thread{

	Connection conn;
	int startPos;
	int endPos;
	String filePath = "E:\\code\\java\\charge17\\download\\src\\test\\resources\\aCopy.txt";

	public DownloadThread( Connection conn, int startPos, int endPos){
		
		this.conn = conn;		
		this.startPos = startPos;
		this.endPos = endPos;
	}
	public void run(){
		try {
			byte[] read = conn.read(startPos, endPos);
            Path path = Paths.get(filePath);
            if (!Files.exists(path)) {
                path = Files.createFile(path);
            }
            OutputStream outputStream = Files.newOutputStream(path);
            outputStream.write(read);
        } catch (IOException e) {
			e.printStackTrace();
		}
	}
}
