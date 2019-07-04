public class Task extends TaskManager {

    public Task(String name, String desc) {

        this();
        this.taskName = name;
        this.taskDesc = desc;

    }
    public Task(){

        this.taskName = "Error!";
        this.taskDesc = "There are no tasks running";
        this.hr = 0;
        this.min = 0;
        this.sec = 0;

    }



    public void print() {
        System.out.println(this.taskName);
        System.out.println(this.taskDesc);
    }
    public String taskName;
    public String taskDesc;



}
