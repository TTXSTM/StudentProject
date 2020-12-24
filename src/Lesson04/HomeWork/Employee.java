package Lesson04.HomeWork;

public class Employee {
    private String FCS;
    private String Post;
    private int number;
    private int money;
    private int Growth;

    Employee(String FCS, String post, int number, int money, int Growth){
        this.FCS = FCS;
        this.Post = post;
        this.number = number;
        this.money = money;
        this.Growth = Growth;

    }

    public String getFCS() {
        return FCS;
    }
    public String getPost() {
        return Post;
    }
    public int getNumber() {
        return number;
    }

    public int getGrowth() {
        return Growth;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }
}
