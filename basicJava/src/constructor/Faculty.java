package constructor;

public class Faculty {
	int id,salary;
String name,subject,college;

Faculty(){
	id=-1;
	name=name;
	subject=subject;
	college=college;
	salary=-1;
	
}

Faculty(int id,String name,String subject,String college,int salary){
this.id=id;
this.name=name;
this.subject=subject;
this.college=college;
this.salary=salary;
}

public String toString() {
return id+" "+name+" "+subject+" "+college+" "+salary;
}


}
