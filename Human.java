public abstract class Human {
    private String name;
    private String gender;
    private int age;

    public Human(String s, String s1, String s2) {
    }

    public void SetGender(String Gender){
        this.gender = Gender;
    }
    public void SetName(String Name){
        this.name = Name;
    }
    public void SetAge(int Age){
        this.age = Age;
    }

    public String GetGender(){
        return gender;
    }
    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }


}
