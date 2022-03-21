package CsvOperations;

import static io.restassured.RestAssured.given;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.github.dockerjava.transport.DockerHttpClient.Response;
//Csv is also format similar to Json
//We need to add java jackson library in order to work with serialization

/*we'll use a combination of ObjectMapper and CSVMapper to convert between JSON and CSV. 
[ObjectMapper is the main actor class of Jackson library. 
 ObjectMapper class ObjectMapper provides functionality for reading and writing JSON] */

	public void Test_01() throws Exception {

	// GET Method invoked and write the json response to .csv	
		  
		  Response response = given().auth()
		.basic("username", "****").when() // enter valid credentials 
		.get("http://lms rest assured api/ "); // use valid api  
		 
		  try
		  {
		  // We used Jackson's ObjectMapper to read our JSON document into a tree of JsonNode objects
			  
			  JsonNode jsonTree = new ObjectMapper().readTree(response.asString());
			  
			  //CsvSchema. This determines the column headers, types, and sequence of columns in the CSV file.
			  //To do this, we created a CsvSchema Builder and set the column headers to match the JSON field names
			  
			  	CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
	 			JsonNode firstObject = jsonTree.elements().next();
			    firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
			    CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
			  
			  // We created a CsvMapper with our CsvSchema, and finally, we write the jsonTree to our CSV file
			  CsvMapper csvMapper = new CsvMapper();
			  csvMapper.writerFor(JsonNode.class)
			    .with(csvSchema)
		.writeValue(new File("src/test/resources/lmsget.csv"), jsonTree);

		  }
		  catch(Exception ex)
		  {
			  throw ex;
		  }
		}
	
	


