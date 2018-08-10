package banking8;

//�Զ����쳣
public class OverdraftException extends Exception{
	static final long serialVersionUID = -338751699948L;
	private double deficit;//��ǰ���۳����������

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
