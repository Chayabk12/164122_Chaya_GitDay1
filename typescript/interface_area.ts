interface area{
    color: String
    toString():void;
    area():number;
}

class Rectangle implements area{

    width: number
    height:number
    color: String
    constructor(color:String, width: number, height:number){
        this.height=height
        this.width=width
        this.color=color
    }

    area():number{
        return 3.14*this.width*this.height;
       }
           toString(){
           console.log(this.area()+" "+ this.color) 
       }
}

class Circle implements area
{
    color: String
    radius: number
    constructor (color: String, radius: number) {
        this.color = color;
        this.radius=radius
 } 
area():number{
 return 3.14*this.radius*this.radius;
}
    toString(){
    console.log(this.area()+" "+ this.color) 
}
}
let circle: area= new Circle("red", 2);
 circle.area();
 circle.toString();
let rectangle : area= new Rectangle("blue", 12, 5);
rectangle.area();
rectangle.toString();