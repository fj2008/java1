package chapter1;

// 나만의 예외 클래스를 만듬
// My Exception이 ArrayIndexOutofBoundsException 등과 동일한 예외가 된다.
public class MyException extends RuntimeException {
	// 직렬화
	private static final long serialVersionUID = -2103221287283272330L;

	// msg -> 예외가 왜 발생했는지, 사유임
	public MyException(String msg){
		super(msg);
	}
}
