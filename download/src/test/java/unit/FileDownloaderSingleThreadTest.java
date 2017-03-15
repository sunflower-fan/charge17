import api.ConnectionManager;
import api.DownloadListener;
import impl.ConnectionManagerImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class FileDownloaderSingleThreadTest {
	boolean downloadFinished = false;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDownload() {
		
		String url = "/a.txt";
		FileDownloader downloader = new FileDownloader(url);
		ConnectionManager cm = new ConnectionManagerImpl();
		downloader.setConnectionManager(cm);
		try {
			downloader.execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
