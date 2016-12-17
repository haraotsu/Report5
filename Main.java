package jp.ac.uryukyu.ie.e165722;

/**
 * Created by e165722 on 2016/12/17.
 */
public class Main {
    public static void main(String[] args){
        String str = null;

        try{
            System.out.println(str.length());
        }catch(NullPointerException ex) {
            System.out.println("NullPointerExceptionが発生しました");
            ex.printStackTrace();

        }
    }
}
