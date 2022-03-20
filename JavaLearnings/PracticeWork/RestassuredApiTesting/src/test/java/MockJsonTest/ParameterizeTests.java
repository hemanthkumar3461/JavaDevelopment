/*
 * package MockJsonTest;
 * 
 * import static io.restassured.RestAssured.given;
 * 
 * import org.testng.annotations.DataProvider; import
 * org.testng.annotations.Test;
 * 
 * import files.ReusableMethods; import io.restassured.RestAssured; import
 * io.restassured.path.json.JsonPath; import io.restassured.response.Response;
 * 
 * public class ParameterizeTests {
 * 
 * @Test(dataProvider="BooksData") public void addBook(String isbn,String aisle)
 * 
 * {
 * 
 * RestAssured.baseURI="http://216.10.245.166";//This Uri is not working. So our
 * tests will fail
 * 
 * Response
 * resp=given().header("Content-Type","application/json").body(payLoad.Addbook(
 * isbn,aisle)). when().post("/Library/Addbook.php").
 * then().assertThat().statusCode(200).extract().response();
 * 
 * JsonPath js= ReusableMethods.rawToJson(resp);//This method parses string to
 * json to retrive values
 * 
 * String id=js.get("ID"); System.out.println(id); //deleteBOok }
 * 
 * 
 * @DataProvider(name="BooksData") public Object[][] getData() {
 * //array=collection of elements //multidimensional array= collection of arrays
 * return new Object[][]{‌{"ojfwty","9363"},{"cwetee","4253"},
 * {"okmfet","533"}};
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * 
 */