package GsonDemo;

import com.google.gson.Gson;

public class GsonDemo {

	public static void main(String[] args) {
		getJson(new User("hemanth","kumar",30));
		
	}
	//Serialization
	public static void getJson(User user) {
		Gson gson = new Gson();

		String json = gson.toJson(user);
		System.out.println(user);
		System.out.println(json);
	}
	//Deserialization
	/*
	 * private static void getObj(String json) { Gson gson = new Gson(); User user =
	 * gson.fromJson(json, User.class);
	 * 
	 * 
	 * System.out.println(user.getFirstname());
	 * System.out.println(user.getLastname()); System.out.println(user.getAge()); }
	 */
	
}
