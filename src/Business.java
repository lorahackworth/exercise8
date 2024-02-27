public class Business extends Contact{
    private String phoneNum;

    public Business(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void display(){
        System.out.println("Name: " + this.getName() +
                "\nEmail: " + this.getEmail() +
                "\nPhone number: " + this.getPhoneNum() +
                "\n");
    }
}
