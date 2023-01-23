package bookstore;

public class MembersFactory {
    public static final int[] ids = {1,2,3,4,5,6,7,8,9,10};
    public static AbstractMembers getId_no(int id_no) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == id_no){
                return new RegisteredMembers(id_no);            
            }} 
        return new NonRegusteredMembers(); 
    }}
