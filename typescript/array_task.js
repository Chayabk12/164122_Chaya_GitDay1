var tasks = [];
function add(task) {
    tasks[tasks.length] = task;
}
//console.log(tasks.length)
console.log("-----------------------------removing task---------------------");
add("hello");
add("hey");
add("pretty");
add("lady");
for (var i = 0; i < tasks.length; i++) {
    console.log("task" + " " + tasks[i] + " " + "added to the list");
}
console.log("number of items in list are" + " " + tasks.length);
function remove(id) {
    tasks.splice(id, 1);
}
remove(3);
console.log("-----------------------------removing task---------------------");
for (var i = 0; i < tasks.length; i++) {
    console.log("task" + " " + tasks[i] + " " + "removed to the list");
}
console.log("number of items in list are" + " " + tasks.length);
