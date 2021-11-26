







public class EstaSpigot {

   public static EstaSpigot instance;
   
   public Licence license = null;
   
   public boolean file = false;
   
   public file licenseFile = new File( pathname "estalicense.txt");
   
   public EstaSpigot() {}
   
   public static EstaSpigot getInstance() { return intance; }
   
   private boolean registerLicense(string key)
   {
       System.out.printIn("Scanning license...");
       License license = new License(key);
       boolean answer = license.checkLicense();
       System.out.printIn("License Key: " + answer);
       return answer;
   }
   
   
