/*
 * package CsvOperations;
 * 
 * import static io.restassured.RestAssured.given;
 * 
 * import java.io.File;
 * 
 * import org.testng.annotations.Test;
 * 
 * import com.fasterxml.jackson.databind.JsonNode; import
 * com.fasterxml.jackson.databind.ObjectMapper; import
 * com.fasterxml.jackson.dataformat.csv.CsvMapper; import
 * com.fasterxml.jackson.dataformat.csv.CsvSchema;
 * 
 * public class lms_get.java {
 * 
 * @Test
 * 
 * public void Test_01(){
 * 
 * // GET Method invoked and write the json response to .csv
 * 
 * io.restassured.response.Response response = given().auth() .basic("username",
 * "hemanth").when() // enter valid credentials .get("**********"); // use valid
 * api try { // We used Jackson's ObjectMapper to read our JSON document into a
 * tree of JsonNode objects
 * 
 * JsonNode jsonTree = new ObjectMapper().readTree(response.asString());
 * 
 * //CsvSchema. This determines the column headers, types, and sequence of
 * columns in the CSV file. //To do this, we created a CsvSchema Builder and set
 * the column headers to match the JSON field names
 * 
 * final CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder(); JsonNode
 * firstObject = jsonTree.elements().next();
 * firstObject.fieldNames().forEachRemaining(fieldName ->
 * {csvSchemaBuilder.addColumn(fieldName);} ); CsvSchema csvSchema =
 * csvSchemaBuilder.build().withHeader();
 * 
 * // We created a CsvMapper with our CsvSchema, and finally, we write the
 * jsonTree to our CSV file CsvMapper csvMapper = new CsvMapper();
 * csvMapper.writerFor(JsonNode.class) .with(csvSchema) .writeValue(new
 * File("src/test/resources/lmsget.csv"), jsonTree);
 * 
 * } catch(Exception ex)
 * 
 * { throw ex; } }}
 * 
 */