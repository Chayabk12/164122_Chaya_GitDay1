export interface todointerface{
     tasks: String[];
     addTasks(task:String) :number;
     deleteTask(task:String);
     listAllTasks();
}