var Rectangle = /** @class */ (function () {
    function Rectangle(color, width, height) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
    Rectangle.prototype.area = function () {
        return 3.14 * this.width * this.height;
    };
    Rectangle.prototype.toString = function () {
        console.log(this.area() + " " + this.color);
    };
    return Rectangle;
}());
var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14 * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        console.log(this.area() + " " + this.color);
    };
    return Circle;
}());
var circle = new Circle("red", 2);
circle.area();
circle.toString();
var rectangle = new Rectangle("blue", 12, 5);
rectangle.area();
rectangle.toString();
