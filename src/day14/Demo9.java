package day14;
import java.util.*;
public class Demo9 {
public static void main(String[] args) throws NameOrPwdException {

	Scanner s=new Scanner(System.in);
	String user=s.nextLine();
	String pwd=s.nextLine();

	if(user.equals("epfox")&&pwd.equals("123456")) {
		System.out.println("账号密码正确");
	}else {
		throw new NameOrPwdException("用户名或密码错误");
	}

}
}
class NameOrPwdException extends Exception{

	public NameOrPwdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
