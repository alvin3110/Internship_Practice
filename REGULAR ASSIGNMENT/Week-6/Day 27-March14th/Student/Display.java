
public class Display {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Student st=new Student();
    st.setRollno(1234);
    st.setName("Rian");
    st.setDept("ece");
    st.setSection('c');
    System.out.println(st.getRollno()+" "+st.getName()+" "+st.getDept()+" "+st.getSection());
    }
}