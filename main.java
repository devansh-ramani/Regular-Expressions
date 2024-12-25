// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class main {
    public static void main(String[] args) {
        String str1 = "35";
        String pattern1 = "[0-9]|[1-4][0-9]";
        System.out.println("str1 : " + str1.matches(pattern1));

        String str2 = "245.245.245.245";
        String s1="([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])";
        String pattern2 = s1+"\\."+s1+"\\."+s1+"\\."+s1;
        System.out.println("str2 : " + str2.matches(pattern2));
        
        String str3 = "abc@gmail.com";
        String pattern3 = "[\\w][\\w\\d_\\-]*@gmail\\.com";
        System.out.println("str3 : " + str3.matches(pattern3));

        String str4 = "+091-269-265131";
        String pattern4 = "\\+[\\d]{1,3}\\-[\\d]{3,4}\\-[\\d]{6}";
        System.out.println("str4 : " + str4.matches(pattern4));
    }
}