"use strict";
exports.__esModule = true;
var main = /** @class */ (function () {
    function main() {
        this.tasks = [];
    }
    main.prototype.addTasks = function (task) {
        this.tasks[this.tasks.length] = task;
        return this.tasks.length;
    };
    main.prototype.deleteTask = function (task) {
        for (var i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] == task)
                console.log("deleting task" + this.tasks[i] + "number of items in the list are" + task[i].length);
            this.tasks.splice(i, 1);
        }
    };
    main.prototype.listAllTasks = function () {
        for (var i = 0; i < this.tasks.length; i++) {
            console.log(this.tasks[i]);
        }
    };
    return main;
}());
var obj = new main();
console.log(obj.addTasks("chaya"));
console.log(obj.addTasks("mahesh"));
console.log(obj.addTasks("prem"));
obj.listAllTasks();
obj.deleteTask("chaya");
obj.listAllTasks();
