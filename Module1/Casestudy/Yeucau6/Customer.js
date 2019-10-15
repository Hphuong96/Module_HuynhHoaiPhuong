let Customer = function () {
    this.setNameCustomer = function (name) {
        this.nameCustomer = name;
    };
    this.getNameCustomer = function () {
        return this.nameCustomer;
    };
    this.setIdCard = function (idCard) {
        this.idCard = idCard;
    };
    this.getIdCard = function () {
        return this.idCard;
    };

    this.setBirthDay = function (birthDay) {
        this.birthDay = birthDay;
    };
    this.getBirthDay = function () {
        return this.birthDay;
    };

    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };

    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this.address;
    };

    this.setTypeCustomer = function (typeCustomer) {
        this.TypeCustomer = typeCustomer;
    };
    this.getTypeCustomer = function () {
        return this.TypeCustomer;
    };

    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };

    this.setAccompanying = function (accompanying) {
        this.accompanying = accompanying;
    };
    this.getAccompanying = function () {
        return this.accompanying;
    };

    this.setDayOfRent = function (dayOfRent) {
        this.dayOfRent = dayOfRent;
    };
    this.getDayOfRent = function () {
        return this.dayOfRent;
    };

    this.setServiceType = function (serviceType) {
        this.serviceType = serviceType;
    };
    this.getServiceType = function () {
        return this.serviceType;
    };

    this.setRoomType = function (roomType) {
        this.roomType = roomType;
    };
    this.getRoomType = function () {
        return this.roomType;
    };

    this.totalPay = function () {
        let moneyPerDay ;
        if (this.getServiceType() === "Villa") {
            moneyPerDay = 500;
        } else if (this.getServiceType() === "House") {
            moneyPerDay = 300;
        } else if (this.getServiceType() === "Room") {
            moneyPerDay = 100
        }
        return moneyPerDay * parseFloat(this.getDayOfRent())*(1 - this.getDiscount()/100);
    };
};