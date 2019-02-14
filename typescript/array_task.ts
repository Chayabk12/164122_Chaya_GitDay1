  var tasks : String[]=[];
  var length=tasks.length
  function add(task:String)
  {
      tasks[tasks.length]=task
 }
 //console.log(tasks.length)
 console.log("-----------------------------removing task---------------------")
  add("hello")
  add("hey")
  add("pretty")
  add("lady")
  for(var i = 0;i<length;i++) {
    console.log("task"+ " "+ tasks[i]+ " "+ "added to the list")
 }
    console.log("number of items in list are"+ " " +tasks.length)

    function remove(id:number)
    {
        tasks.splice(id,1)
    }
remove(3)
console.log("-----------------------------removing task---------------------")
for(var i = 0;i<length;i++) { 
    console.log("task"+ " "+ tasks[i]+ " "+ "removed to the list")
 }
 console.log("number of items in list are"+ " " +tasks.length)