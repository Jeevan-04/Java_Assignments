package Assignment2;

public class Question5 {
    private String name;
    private String email;
    private char gender;

    public Question5(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }

    public static void main(String[] args) {
        Question5 author = new Question5("john doe", "joedoe@gmail.com", 'm');
        System.out.println(author.toString());
        author.setEmail("HelloWorld@example.com");
        System.out.println("Updated Email: " + author.getEmail());
    }
}
