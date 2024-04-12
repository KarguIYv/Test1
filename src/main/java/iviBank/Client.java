package iviBank;

public class Client {
    private String name;
    private String surname;
    private int age;
    private long id;

    public Client(String name, String surname, int age, long id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }


    private void showInfo(String clientNeme, int clientAge){
        System.out.println("Hello"+ clientNeme+ ","+"you're" + clientAge);
    }

}
