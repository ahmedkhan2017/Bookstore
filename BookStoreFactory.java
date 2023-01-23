package bookstore;

abstract class BookStoreFactory {
    public abstract BookStoreInterface OpenBook();
}

class BookListFactory extends BookStoreFactory { 
    public BookStoreInterface OpenBook() { 
        return new F_BookList();               
    } 
}  
class EditBooksFactory extends BookStoreFactory { 
    public BookStoreInterface OpenBook(){  	 	
        return new F_Editbooks(); 
    } 
}              
 class MembershipCardFactory extends BookStoreFactory{
    public BookStoreInterface OpenBook(){  	 	
        return new F_MembershipCard(); 
    } 
 }  

 class AuthorsListFactory extends BookStoreFactory{
    public BookStoreInterface OpenBook(){  	
        return new F_AuthorsList(); 
    } 
 } 
    

