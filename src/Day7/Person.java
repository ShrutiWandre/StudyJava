package Day7;

public class Person {

    private String personName;
    private String personPhone;
    private String personEmail;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String toString(){
        return String.format("Name --> %s\tPhone --> %s\tEmail --> %s\t", personName, personPhone, personEmail);
    }

}
