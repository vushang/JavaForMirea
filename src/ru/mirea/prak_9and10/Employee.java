package ru.mirea.prak_9and10;

public class Employee {
    private String firstname;
    private String surname;
    private String JobTitle;
    private int salary;

    public Employee(String firstname, String surname, String JobTitle){
        this.firstname = firstname;
        this.surname = surname;
        this.JobTitle = JobTitle;
        setJobTitle();
    }

    public Employee(String JobTitle){
        this.JobTitle = JobTitle;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private void setFirstnameAndSurname() {
        String[] firstNames = new String[]{"Oliver", "Jack", "Harry", "Jacob", "Charley", "Thomas", "George", "Oscar" };
        String[] surNames = new String[]{"Williams", "Peters", "Gibson", "Martin", "Jordan", "Jackson", "Grant", "Davis"};
        this.firstname = firstNames[(int)(Math.random() * 7)];
        this.surname = surNames[(int)(Math.random() * 7)];
    }

    public int getSalary() {
        return salary;
    }

    ///////////////////////////////////////
    private void setJobTitle() {
        switch (JobTitle) {
            case "Operator":
                Operator operator = new Operator();
                this.salary = operator.getSalary();
                break;
            case "Manager":
                Manager manager = new Manager();
                this.salary = manager.getSalary();
                break;
            case "TopManager":
                TopManager topManager = new TopManager();
                this.salary = topManager.getSalary();
                break;
            default:
                System.out.println("Возникла ошибка >_<");
                break;
        }
    }
    /////////////////////////////////////////

    public String getJobTitle() {
        return JobTitle;
    }


}
