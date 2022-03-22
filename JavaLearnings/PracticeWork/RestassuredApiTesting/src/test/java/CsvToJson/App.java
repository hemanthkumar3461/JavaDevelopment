/*
 * package CsvToJson;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.FileNotFoundException;
 * 
 * import com.fasterxml.jackson.core.JsonParseException; import
 * com.fasterxml.jackson.core.type.TypeReference;
 * 
 * public class App {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * try { FileInputStream mapper = new FileInputStream(new
 * File("C:\\Users\\heman\\Desktop\\democsvtest.csv"));
 * TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>()
 * {}; FileInputStream inputStream; List<Person> persons =
 * mapper.readValue(inputStream, typeReference); for(Person p: persons) {
 * System.out.println("name is "+p.getFirstname()+" city is" +
 * p.getAddress().getCity()); } Person person = new Person();
 * person.setFirstname("Jacl"); person.setLastname("Jenny"); person.setAge(52);
 * person.setAddress(new Address("tpt","a.p")); mapper.writeValue(new
 * File("/.json"), person); inputStream.close(); } catch (FileNotFoundException
 * e) { e.printStackTrace(); } catch(JsonParseException e) {
 * e.printStackTrace(); } }
 * 
 * }
 * 
 * 
 */