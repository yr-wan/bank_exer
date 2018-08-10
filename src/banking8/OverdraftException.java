package banking8;

//自定义异常
public class OverdraftException extends Exception{
	static final long serialVersionUID = -338751699948L;
	private double deficit;//当前余额扣除请求的数额

	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String msg) {
		super(msg);
	}
	public OverdraftException(String msg, double deficit) {
		super(msg);
		this.deficit = deficit;
	}
}
