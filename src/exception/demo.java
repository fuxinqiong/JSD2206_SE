package exception;

public class demo {
    public static void main(String[] args) {
        try {
            String str= "";
            System.out.println(str.charAt(1));
        }catch (NullPointerException e){
            System.out.println("kong");
        }catch (RuntimeException e){
            System.out.println("yun");
        }catch (Exception e){
            System.out.println("qit");
        }
    }
}
