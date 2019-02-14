import {Todo} from './main';
export interface TodoItemInterface{
    title:string;
    status:boolean;
    upadatedAt:Date;
    toggleStatus();
}

export interface Todolist{
    TodoItems:Todo[];
    addTask(task:Todo);
    listAllTasks();
    deleteTask(task:Todo);
    }

