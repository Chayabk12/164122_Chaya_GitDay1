import {TodoItemInterface} from './interfaces'
import {TodoListInterface} from './interfaces'


export class TodoItem implements TodoItemInterface{

    title: String
    status: boolean
    updatedAt : Date

    constructor (title: String){
        this.title= title
        this.status= false
        this.updatedAt= new Date()
    }

toggleStatus(){
    if(this.status=true){
      this.status=false
    }
    else{
        this.status=true
    }
}
}

class TodoList implements TodoListInterface{
TodoItems : TodoItem[] = new Array()
addTask(task:TodoItem)
{
    this.TodoItems[this.TodoItems.length]=task
    console.log(this.TodoItems.length)
}

listAllTasks(){
    for(var i= 0; i<this.TodoItems.length; i++)
    console.log(this.TodoItems[i])
}
deleteTask(task:TodoItem){
    var len=this.TodoItems.indexOf(task,0);
        if(len>-1){
           var removed= this.TodoItems.splice(len,1);
           return "number of elements "+this.TodoItems.length+" removed:"+removed;
        }
        else{
            console.log("Pass correct values!!!!!");
        }
}
}


var obj=new TodoList();
var todoObj=new TodoItem("hello world");
var todoobj1=new TodoItem("how you doing");
obj.addTask(todoObj);
obj.addTask(todoobj1);
obj.listAllTasks();
console.log(obj.deleteTask(todoObj));
obj.listAllTasks();


