package impl;

import api.Connection;

import java.io.IOException;

public class ConnectionImpl implements Connection{

	public byte[] read(int startPos, int endPos) throws IOException {
		return new byte[0];
	}

	public int getContentLength() {
		return 0;
	}

	public void close() {

	}
}
