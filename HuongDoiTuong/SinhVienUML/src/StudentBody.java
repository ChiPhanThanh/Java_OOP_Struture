
// Assosiation: Moi quan he lien ket
public class StudentBody {
    public static void main(String [] args){

        Address address1  = new Address("tpVinh","Vinh","1",456);
        Student chi = new Student("chi", "phan", "dgd", "vinh university", address1);

        System.out.print("  THong tin sinh " +"\n" + chi.toString() + "\n");
        System.out.print(address1.toString());
    }
}
