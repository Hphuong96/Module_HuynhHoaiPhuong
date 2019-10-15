let HocSinh = function () {
    this.setNumber = function (number) {
        this.number = number
    };
    this.getNumber = function () {
        return this.number
    };
    this.setName = function (name) {
        this.name = name
    };
    this.getName = function () {
        return this.name
    };
    this.setBirthDay = function (birthday) {
        this.birthday = birthday
    };
    this.getBirthDay = function () {
        return this.birthday
    };
    this.setPoint = function (point) {
        this.point = point
    };
    this.getPoint = function () {
        return this.point
    };
    this.setStudentLevel = function () {
        let studentLevel ;
        if (this.getPoint() >8){
            studentLevel = "Gioi"
        } else if (this.getPoint() <=8 && this.getPoint() >=6.5) {
            studentLevel = "Kha"
        } else if (this.getPoint() <6.5 && this.getPoint() >=5) {
            studentLevel = "Trung Binh"
        } else if (this.getPoint() <5 && this.getPoint() >=3.5) {
            studentLevel = "Yeu"
        } else {
            studentLevel = "Kem"
        }
        return studentLevel;
    }
};