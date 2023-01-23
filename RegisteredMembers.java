package bookstore;

public class RegisteredMembers extends AbstractMembers {
    public RegisteredMembers(int id_no ){
        this.id = id_no;
    }
    @Override 
    public boolean isNull(){   
        return false;
    }
    @Override 
    public String getId() {
        return(Integer.toString(id));
    } 
    @Override
    public String status(){
         return"Registered";     
    }
   
} 
