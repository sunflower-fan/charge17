package impl;

import api.Connection;

import java.io.IOException;
import java.io.InputStream;

public class ConnectionImpl implements Connection{

	InputStream inputStream;

	public ConnectionImpl(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public byte[] read(int startPos, int endPos) throws IOException {
		byte[] bytes = new byte[1000];
		inputStream.read(bytes, startPos, endPos - startPos + 1);
		return bytes;
	}

	public int getContentLength() throws IOException {
		return inputStream.available();
	}

	public void close() throws IOException {
		inputStream.close();
	}
}
