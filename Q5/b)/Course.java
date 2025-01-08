public class Course {

    private int code;
    private List<Book> book;

    Course(int code, List<Book> book){
        this.code = code;
        this.book = new ArrayList<Book>();
    }

}
