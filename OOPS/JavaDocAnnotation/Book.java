
//I want to document this class, java provides some tags to implement it
/**@author Akash Jaiswal
 * @version 2.0
 * @since 2021
 **/
package JavaDocAnnotation;

/**
 * @author Akash Jaiswal
 * Class for Library Book
 */

public class Book {

    /**
     * @value 10 default value
     */
    static int val=10;

    /**
     * 
     * @param s Book Name
     */
    public Book(String s){}

    /**
     * Issue a book to a Student
     * @param roll roll number of a student
     * @throws Exception if book is not availble , throws exception
     */
    public void issue(int roll) throws Exception{}

    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){
        return "";
    }
}
