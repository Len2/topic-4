package topic4.topic4.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public interface ConverterService {
	File pdf() throws FileNotFoundException, MalformedURLException;
}
