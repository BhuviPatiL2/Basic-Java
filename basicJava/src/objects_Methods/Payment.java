package objects_Methods;
import java.util.*;
public class Payment {
Scanner sc=new Scanner (System.in);
	int p_Id;
	String p_mode;
	float balance;
	public int getP_Id() {
		return p_Id;
	}
	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}
	public String getP_mode() {
		return p_mode;
	}
	public void setP_mode(String p_mode) {
		this.p_mode = p_mode;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}