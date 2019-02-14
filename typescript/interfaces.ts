

import {TodoItem} from './main1'
export interface TodoItemInterface{

    title: String
    status : boolean
    updatedAt : Date
    toggleStatus()
}

export interface TodoListInterface{
   TodoItems : TodoItem[];
   addTask(task:TodoItem)
   listAllTasks()
   deleteTask(task: TodoItem)
 }


