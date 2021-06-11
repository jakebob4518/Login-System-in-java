public class Main {

    public static void main(String[] args){

        IDandPass idandpass = new IDandPass();


        LoginPage loginPage = new LoginPage(idandpass.getLoginInfo());
    }
}
