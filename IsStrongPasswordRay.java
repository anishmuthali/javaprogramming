/**
 * Auto Generated Java Class.
 */
public class IsStrongPasswordRay {
  
  public static void main(String args[]){
    //should be true
    System.out.println(isStrongPassword("MsVisaIsTheBestTeacherIn2016!"));
    //should be false
    System.out.println(isStrongPassword("thispasswordisnotstrong"));
    //should be true
    System.out.println(isStrongPassword("Str0ng!!!!"));
  }
  
  public static boolean isStrongPassword(String s){
    //finds all these true: length must be more than 8, must have upper and lower case letters, as well as at least one special character
    if((s.length()>=8)&&(upper(s)==true)&&(lower(s)==true)&&(special(s)==true)){
      return true;
    }
    return false;
  }
//finds the uppercase letter in the Password
  public static boolean upper(String s){
    int l=s.length();
    for(int i=0; i<l; i++){
      Character hi = s.charAt(i);
      if(Character.isUpperCase(hi)){
        return true;
      }
        continue;
      }
    return false;
    }
  
//Find the lower case letter in the String
  public static boolean lower(String s){
    int l=s.length();
    for(int i=0; i<l; i++){
      Character hi = s.charAt(i);
      if(Character.isLowerCase(hi)){
        return true;
      }
        continue;
      }
    return false;
    }
  //find the Special character, only ONE needed
  public static boolean special(String s){
    int l=s.length();
    for(int i=0; i<l; i++){
      Character hi = s.charAt(i);
      if((hi=='$')||(hi=='#')||(hi=='@')||(hi=='*')||(hi=='!')||(hi=='%')||(hi=='^')||(hi=='&')){
        return true;
      }
        continue;
      }
    return false;
    }
  
  }
