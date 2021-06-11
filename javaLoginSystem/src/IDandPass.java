import java.util.HashMap;



public class IDandPass {

    /* Creating a HashMap to store the username and password { mainly two strings }*/

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPass(){
        /* Here you can add the username (userID) and password (userPassword) */

        logininfo.put("test123", "passtest123");

        // logininfo.put("","");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
