package chapter06;

public class java04_Exception {
    public static void main(String[] args){
        // TODO 错误

        String account = "admin";
        String password = "123123";
        try {
            login(account,password);
        }catch (AccountException accountException){
            System.out.println("账号不正确！");
        }catch (PasswordException passwordException){
            System.out.println("密码不正确");
        }

    }
    public static void login(String account, String password) throws LoginException{
        if(!"admin".equals(account)){
            throw new AccountException("账号不正确");
        }
        if(!"amin".equals(password)){
            throw new PasswordException("密码不正确");
        }
        System.out.println("登陆成功");
    }
}
class AccountException extends LoginException{
    public AccountException(String message) {
        super(message);
    }
}
class PasswordException extends LoginException{

    public PasswordException(String message) {
        super(message);
    }
}


// TODO 自定义异常
class LoginException extends RuntimeException {
    public  LoginException(String message){
        super(message);
    }
}



