package jp.ac.uryukyu.ie.e165722;


public class Main {
    public static void main(String[] args){
        String str = "3．14";

        try{
            System.out.println(str.length());
        }catch(NullPointerException ex) {
            System.out.println("NullPointerExceptionが発生しました");
            ex.printStackTrace();

        }
        double value = Double.parseDouble(str);
    }
}
