package api.endpoints;

//baseUrl: https://petstore.swagger.io/v2
//create User URl: https://petstore.swagger.io/v2/user
//get User URl: https://petstore.swagger.io/v2/user/{username}
//update User URl: https://petstore.swagger.io/v2/user/{username}
//delete User URl: https://petstore.swagger.io/v2/user/{username}


public class Routes {

	public static String base_url= "https://petstore.swagger.io/v2";

	public static String post_url= base_url+"/user";
	public static String get_url= base_url+"/user/{username}";
	public static String update_url= base_url+"/user/{username}";
	public static String delete_url= base_url+"/user/{username}";

}
