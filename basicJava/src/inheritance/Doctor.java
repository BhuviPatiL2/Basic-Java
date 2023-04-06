package inheritance;

public class Doctor extends Person2 {
	int did;
	String spe,hname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getSpe() {
		return spe;
	}
	public void setSpe(String spe) {
		this.spe = spe;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	
	void display() {
		System.out.println(name+" "+contact+" "+address+" "+did+" "+spe+" "+hname);
	}

}
