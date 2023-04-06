package inheritance;

public class Patient extends Person2 {
	int pid,rno;
	String disease;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	void display(){	
			System.out.println(name+" "+contact+" "+address+" "+pid+" "+rno+" "+disease);

	}	

}
