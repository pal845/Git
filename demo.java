class DemoProgram{
DemoProgram(){
System.out.println("constructor");
}

public static void main(String[] args){
System.out.println("HIII");
DemoProgram d=new DemoProgram();
DemoProgram d1=new DemoProgram();

System.out.println("%%%");
d.m1();
d.m1();
d.m2();
}
public void m1(){
System.out.println("good&&");
}
public void m2(){
System.out.println("ok!!");

}
}
//modified file.....