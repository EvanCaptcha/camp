public class Task {

    public Task(String name, String desc) {

        this.taskName = name;
        this.taskDesc = desc;

    }
    public Task(){

        this.taskName = "Error!";
        this.taskDesc = "There are no tasks running";

    }



    public void print() {
        System.out.println(this.taskName);
        System.out.println(this.taskDesc);
    }
    public String taskName;
    public String taskDesc;



}
