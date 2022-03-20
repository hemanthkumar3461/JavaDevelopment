/*
 * package MockJsonTest; //Static json payload can be provided directly through
 * body or from other class or through a external json file
 * 
 * import static io.restassured.RestAssured.given;
 * 
 * import java.io.IOException; import java.nio.file.Files; import
 * java.nio.file.Paths; import org.testng.annotations.Test; import
 * files.ReusableMethods; import io.restassured.RestAssured; import
 * io.restassured.path.json.JsonPath; import io.restassured.response.Response;
 * 
 * public class StaticJsonPayloadUsingFile {
 * 
 * @Test public void addBook() throws IOException {
 * 
 * RestAssured.baseURI="http://216.10.245.166";//This Uri dont work Response
 * resp= given().header("Content-Type","application/json").body(
 * GenerateStringFromResource("C:\\Users\\rahul\\Documents\\Addbookdetails.json"
 * )). when().post("/Library/Addbook.php").
 * then().assertThat().statusCode(200).extract().response(); JsonPath js=
 * ReusableMethods.rawToJson(resp); String id=js.get("ID");
 * System.out.println(id); //deleteBOok
 * 
 * }
 * 
 * public static String GenerateStringFromResource(String path) throws
 * IOException {//Reads all bytes of file and converts into string return new
 * String(Files.readAllBytes(Paths.get(path)));//This method is used for setting
 * the json file path in our code }
 * 
 * }
 * 
 */