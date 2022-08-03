package excetion;

public class FinallyDemocrat {
    public static void main(String[] args) {
        //输出 0，1，2
        System.out.println(
                test("0")+ ","+ test(null)+","+ test("")
        );

    }
    public static int test(String str){
        try {
            return str.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e) {
            return 2;
        }


/*        //输出 3,3,3
        System.out.println(
                test("0")+ ","+ test(null)+","+ test("")
        );

    }
    public static int test(String str){
        try {
            return str.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
           return 3;
        }*/
    }
}
