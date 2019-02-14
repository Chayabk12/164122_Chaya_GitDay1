import {todointerface} from './todointerface' 
class main implements todointerface{
    tasks : String[]=[];
  
  
    addTasks(task:String)
    {
        this.tasks[this.tasks.length]=task
        return this.tasks.length;
    }

    deleteTask(task:String)
    {
        for(var i=0; i<this.tasks.length; i++)
        {
            if(this.tasks[i]==task)
            console.log("deleting task" + this.tasks[i]+ "number of items in the list are" + task[i].length)
            this.tasks.splice(i,1)
        }
    }
    listAllTasks()
    {

         for( var i=0; i<this.tasks.length; i++)
         {
             console.log(this.tasks[i])
         }
    }
    
}
var obj =new main()
console.log(obj.addTasks("chaya"))
console.log(obj.addTasks("mahesh"))
console.log(obj.addTasks("prem"))
obj.listAllTasks()
obj.deleteTask("chaya")
obj.listAllTasks()