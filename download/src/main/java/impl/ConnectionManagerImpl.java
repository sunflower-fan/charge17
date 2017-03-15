package impl;


import api.Connection;
import api.ConnectionException;
import api.ConnectionManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConnectionManagerImpl implements ConnectionManager {

	public Connection open(String url) throws ConnectionException, URISyntaxException, IOException {
        URI uri = getClass().getResource(url).toURI();
        InputStream inputStream = Files.newInputStream(Paths.get(uri));
        return new ConnectionImpl(inputStream);
	}

}
