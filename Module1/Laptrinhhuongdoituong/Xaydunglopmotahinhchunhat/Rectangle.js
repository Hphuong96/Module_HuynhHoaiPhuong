let rectangle = function () {
    this.setWidth = function (width) {
        this.Width = width;
    };
    this.getWidth = function () {
        return this.Width;
    };
    this.setHeight = function (height) {
        this.Height = height
    };
    this.getHeight = function () {
        return this.Height
    };
    this.area = function () {
        return (this.Width*this.Height);
    };
    this.perimeter = function () {
        return ((this.Width+this.Height)*2);
    };

};