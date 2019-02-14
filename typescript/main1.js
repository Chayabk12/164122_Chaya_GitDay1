"use strict";
exports.__esModule = true;
var TodoItem = /** @class */ (function () {
    function TodoItem(title) {
        this.title = title;
        this.status = false;
        this.updatedAt = new Date();
    }
    TodoItem.prototype.toggleStatus = function () {
        if (this.status = true) {
            this.status = false;
        }
        else {
            this.status = true;
        }
    };
    return TodoItem;
}());
exports.TodoItem = TodoItem;
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.TodoItems = new Array();
    }
    TodoList.prototype.addTask = function (task) {
        this.TodoItems[this.TodoItems.length] = task;
        console.log(this.TodoItems.length);
    };
    TodoList.prototype.listAllTasks = function () {
        for (var i = 0; i < this.TodoItems.length; i++)
            console.log(this.TodoItems[i]);
    };
    TodoList.prototype.deleteTask = function (task) {
        var len = this.TodoItems.indexOf(task, 0);
        if (len > -1) {
            var removed = this.TodoItems.splice(len, 1);
            return "number of elements " + this.TodoItems.length + " removed:" + removed;
        }
        else {
            console.log("Pass correct values!!!!!");
        }
    };
    return TodoList;
}());
var obj = new TodoList();
var todoObj = new TodoItem("hello world");
var todoobj1 = new TodoItem("how you doing");
obj.addTask(todoObj);
obj.addTask(todoobj1);
obj.listAllTasks();
console.log(obj.deleteTask(todoObj));
obj.listAllTasks();
