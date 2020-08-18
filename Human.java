package contacts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Human {

    private String name;
    private String surname;
    private String number = "[no number]";


    public String getName() {
        return name;
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


    public String getNumber() {
        return number;
    }

    private boolean checkNumber(String number) {
        Pattern pattern = Pattern.compile("\\+?" +
                "((\\([0-9A-Za-z]+\\)|[0-9A-Za-z]+)"
                +"|([0-9A-Za-z]+[ -]\\([0-9A-Za-z]{2,}\\))|[0-9A-Za-z]+[ -][0-9A-Za-z]{2,})"
                +"([ -][0-9A-Za-z]{2,}[ -]?)*");

        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public void setNumber(String number) {
        if (checkNumber(number)) {
            this.number = number;
        } else {
            System.out.println("Wrong number format!");
            this.number = "[no number]";
        }
    }


    @Override
    public String toString() {
        return "" + name + " " + surname + ", " + number;
    }

}
