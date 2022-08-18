package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * /regUser?username=fuxinq&password=qwe&nickname=123&age=22
 */
public class UriMapDemo {
    public static void main(String[] args) {
        String uri="/regUser?username=fuxinq&password=qwe&nickname=123&age=22";

        String requestURI;
        String queryString;
        Map<String,String> parameters = new HashMap<>();

        String[] str  = uri.split("\\?");
        String uriStr = str[0];
        System.out.println(uriStr);
        String querystr  = str[1] ;


        String query[] = querystr.split("\\&");


        String[] q1 = query[0].split("\\=");
        String[] q2 = query[1].split("\\=");
        String[] q3 = query[2].split("\\=");
        String[] q4 = query[3].split("\\=");
        System.out.println(query[0]);
        System.out.println(query[1]);
        System.out.println(query[2]);
        System.out.println(q1[0]+":"+q1[1]);
        System.out.println(q2[0]+":"+q2[1]);
        System.out.println(q3[0]+":"+q3[1]);
        String para1 = q1[0]+":"+q1[1];
        String para2 = q2[0]+":"+q2[1];
        String para3 = q3[0]+":"+q3[1];
        System.out.println(para1);
        System.out.println(para2);
        System.out.println(para3);
        parameters.put(q1[0],q1[1]);
        parameters.put(q2[0],q2[1]);
        parameters.put(q3[0],q3[1]);
        System.out.println();

        Set<Map.Entry<String , String>> entrySet = parameters.entrySet();
        for (Map.Entry<String,String> e: entrySet){
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key+":" + value);

        }

//        for (int i = 0; i < ; i++) {
//
//        }






//        requestURI = uriStr;
//        queryString = querystr;
//        System.out.println(requestURI);
//        System.out.println(queryString);



//        String[] param=null;
//        for (int i = 0; i < param.length; i++) {
//             param = querystr.split("\\&");
//            System.out.println(param[i]);
//            String[] para = param[i].split("=");

//            for (int j = 0; j <para.length ; j++) {

//                String[] p= para[i];

//                parameters.put(p);
//                System.out.println(param[i]);

//            }

//            parameters.put(para[i]);
//            Set<Map<String,String>>  set =
//        }
//        Map<String,String> stringStringMap = parameters.put(p[0]+p[1]);
//        System.out.println();




//        StringBuilder builder = new StringBuilder(uri);
//        for (String retval: uri.split("\\?")){
//            System.out.println(retval);
//
//        }
//        System.out.println(builder);
//        String[] requestUri ;
//        ("\\?");
//        System.out.println(requestUri[0]);
//        System.out.println(requestUri[1]);
//        requestURI = requestUri[0];
//        queryString = requestUri[1];
//        System.out.println(requestURI);
//        System.out.println(queryString);

 /*       String[] query = queryString.split("&");



        for (String q: query) {
            System.out.println(q);
//            parameters.put(parameter);
//            parameters.put(q.split("="));
        }*/

    }

    public void spilt(){

    }
}
