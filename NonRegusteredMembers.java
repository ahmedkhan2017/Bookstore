package bookstore;

public class NonRegusteredMembers extends AbstractMembers {
    String nil = "xxxxx";
    @Override 
    public boolean isNull() {
        return true;
    }
    @Override 
    public String getId() {
        return (nil);
    }
    @Override
    public String status(){
        return" Not Registered";        
    }
    
}


   

