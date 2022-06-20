package N_12_LinkedList_to_Users_Tours;

import java.util.Calendar;
import java.util.Date;

public class Users {
    private String name;
    private String lastName;
    private String birthDay;
    private String job;
    private String gender;
    private int Id;


    Users(String gender,int id ,String name, String lastName, String birthDay, String job){
        if(gender.equals("FEMALE")){
            this.gender = FontsColor.morado+gender;
            this.Id = id;
            this.name = name;
            this.lastName = FontsColor.morado+lastName;
            this.birthDay =  FontsColor.morado+birthDay;
            this.job = FontsColor.morado+job;
        }else {
            this.gender = FontsColor.azul+gender;
            this.Id = id;
            this.name = name;
            this.lastName = FontsColor.azul+lastName;
            this.birthDay =  FontsColor.azul+birthDay;
            this.job = FontsColor.azul+job;
        }


    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public int setAge() {
        String[] listAge = this.birthDay.split("/");
        Date yearActuality = Calendar.getInstance().getTime();
        String[] year = String.valueOf(yearActuality).split(" ");
        int yearsOld = Integer.parseInt(String.valueOf(Integer.parseInt(year[year.length-1])-Integer.parseInt(listAge[listAge.length-1])));
        return yearsOld;
    }
    static String genderSelect = "Her";
    public void selectGender(String g){
        if (g != "FEMALE".toUpperCase()) {
            genderSelect = "His";

        }
    }
    public String printData(){
        if (this.gender.equals(FontsColor.morado+"FEMALE"))
            this.name = FontsColor.morado+name;
        else
            this.name = FontsColor.azul+name;

        return FontsColor.verde+ "<<Your Datas is>>:\n"+
                FontsColor.verde+genderSelect+FontsColor.verde+" gender is: "+ this.gender+
                FontsColor.verde+"\nYour ID id: " + this.Id+"\n"+
                FontsColor.verde+genderSelect+"name is: " + this.name + " "+ this.lastName +
                FontsColor.verde+"\nYour age " + FontsColor.morado+setAge()+
                FontsColor.verde+" years old\nYour birthday is: " + this.birthDay +
                FontsColor.verde+"\nYour job is: " + this.job + "\n";
    }
}
