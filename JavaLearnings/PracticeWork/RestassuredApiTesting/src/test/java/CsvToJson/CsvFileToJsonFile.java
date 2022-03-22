package CsvToJson;
import org.json.CDL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.stream.Collectors;

public class CsvFileToJsonFile {
	public static void main(String[] args) {
		// Read csv data file and store it in a string
		InputStream is = CsvFileToJsonFile.class.getResourceAsStream("C:\\Users\\heman\\Desktop\\democsvtest.csv");
		System.out.println(is);
		String csv = new BufferedReader(
				new InputStreamReader(Objects.requireNonNull(is), StandardCharsets.UTF_8))
				.lines()
				.collect(Collectors.joining("\n"));

		try {
			// Convert csv text to JSON string, and save it 
			// to a data.json file.
			String json = CDL.toJSONArray(csv).toString(2);
			Files.write(Path.of("democsvtest.json"), json.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}