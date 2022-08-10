package login;

import com.tedu.springboot2206.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class UserController {
    private static File userDir;
    static {
         userDir = new File("./users");
         if (!userDir.exists()){
             userDir.mkdirs();
         }
    }

    /**
     *
     * @param request
     * @param response
     */
    @RequestMapping("loginUser")
    public void login(HttpServletRequest request,HttpServletResponse response){
        System.out.println("开始处理登录!!!!.........................");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("用户输入密码："+password);
        if (username==null||username.isEmpty() || password==null||password.isEmpty()){
            try {
                response.sendRedirect("/login_info_error.html");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
//        User user = new User(username,password);


//        User user = new User(username,password,nickname,age);

        //在userDir目录下 生成对应用户名的obj文件
        File file = new File(userDir,username+".obj");
        if (!file.exists()){
            try {
                response.sendRedirect("haveno_user.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        try(
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);

        ) {
            Object obj = ois.readObject();
            User user = (User) obj;
            System.out.println("用户正确密码："+user.getPassword());
            if ((username==null)||!username.equals(user.getUsername()) || (password==null)||!password.equals(user.getPassword()) ){
                response.sendRedirect("/login_fail.html");

            }
//            user.getUsername();
            response.sendRedirect("/login_success.html");
            System.out.println("用户登录成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }



    }
    /**
     *
     * @param request
     * @param response
     */


    @RequestMapping("regUser")
    public void reg(HttpServletRequest request , HttpServletResponse response){
        System.out.println("开始处理注册!!!!!!.........................");

        //1.获取注册页面上的表单信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String nickname = request.getParameter("nickname");
        String ageStr = request.getParameter("age");
        System.out.println(username+", "+ password+", "+nickname+", "+ ageStr);
        if (username==null||username.isEmpty() || password==null||password.isEmpty() || nickname==null||
        nickname.isEmpty() || ageStr==null||ageStr.isEmpty()||!ageStr.matches("[0-9]+")
        ){
            try {
                response.sendRedirect("/reg_info_error.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        //将年龄转换为int值
        int age = Integer.parseInt(ageStr);


        /**
         * 2.将注册用户信息以User对象形式序列化到文件中保存
         * 将来所有的保存用户信息的文件都统一房子users目录下，并且每个保存用户的文件的名字格式：用户名.obj
         *
         */

        User user = new User(username,password,nickname,age);

        //在userDir目录下 生成对应用户名的obj文件
        File file = new File(userDir,username+".obj");

        //如果该文件存在，则说明这是一个已注册用户
        if (file.exists()){
            try {
                response.sendRedirect("have_user.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }


        /**  序列化一个对象输出流, 并输出obj文件保存 */



        try(
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

        ) {


//            FileInputStream stream = new FileInputStream("person.obj");

            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


/**
         * 返回响应给客户端浏览器
         *
         */

        try {
            response.sendRedirect("/reg_success.html"); //
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
