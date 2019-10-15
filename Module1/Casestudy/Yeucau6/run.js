let customerArray = [];
let checkDeleteCustomer = false;
let checkEditCustomer = false;
let checkDisplayTotalPay = false;
let checkValidate = false;
let validateBirthDay = /(^(((0[1-9]|1[0-9]|2[0-8])[\/](0[1-9]|1[012]))|((29|30|31)[\/](0[13578]|1[02]))|((29|30)[\/](0[4,6,9]|11)))[\/](19|[2-9][0-9])\d\d$)|(^29[\/]02[\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)/;
let validateEmail = /^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$/;

function displayMainMenu() {
    let chooseEdit = prompt(
        "1. Add New Customer." + "\n" +
        "2. Display Information Customer." + "\n" +
        "3. Display Total Pay Customer." + "\n" +
        "4. Edit Information Customer." + "\n" +
        "5. Delete Customer." + "\n" +
        "6. Exit." + "\n");
    switch (chooseEdit) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            displayCustomer();
            break;
        case "3":
            displayTotalPayCustomer();
            break;
        case "4":
            chooseEditInformationCustomer();
            break;
        case"5":
            chooseDeleteCustomer();
            break;
        case "6":
            exit();
            break;
        default:
            displayMainMenu();
            break;
    }
}

function addNewCustomer() {
    let customerInput = new Customer();
    customerInput.setNameCustomer(prompt("Enter Name :"));
    customerInput.setIdCard(prompt("Enter Id Card:"));

    do {
        customerInput.setBirthDay(prompt("Enter BirthDay: "));
        if (validateBirthDay.test(customerInput.getBirthDay())) {
            checkValidate = true;
        } else {
            alert("BirthDay is invalid !")
        }
    } while (!checkValidate) ;

    do {
        let checkValidate = false;
        customerInput.setEmail(prompt("Enter Email:"));
        if (validateEmail.test(customerInput.getEmail())) {
            checkValidate = true;
        } else {
            alert("Email is invalid !!")
        }
    } while (!checkValidate);

    customerInput.setAddress(prompt("Enter Address:"));
    customerInput.setTypeCustomer(prompt("Enter Type Customer:"));
    customerInput.setDiscount(prompt("Enter Discont:"));
    customerInput.setAccompanying(prompt("Enter Accompanying:"));
    customerInput.setDayOfRent(prompt("Enter Day Of Rent:"));
    customerInput.setServiceType(prompt("Enter Service Type:"));
    customerInput.setRoomType(prompt("Enter Room Type:"));
    customerArray.push(customerInput);
    displayMainMenu();
}

function displayCustomer() {
    let result = "";
    for (let i = 0; i < customerArray.length; i++) {
        result += "\n" + (i + 1) + "." + "Name:" + customerArray[i].getNameCustomer() +
            ";IdCard :" + customerArray[i].getIdCard();
    }
    result += "\n" + (customerArray.length + 1) + "Back to menu";
    let chooseDisplayInfo = prompt(result);
    if (chooseDisplayInfo.toString() !== (customerArray.length + 1).toString()) {
        if (!checkDeleteCustomer && !checkDisplayTotalPay) {
            displayInformationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else if (checkDeleteCustomer) {
            deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else {
            displayTotalPay(Number.parseInt(chooseDisplayInfo) - 1);
        }
    } else {
        checkDeleteCustomer = false;
        checkEditCustomer = false;
        checkDisplayTotalPay = false;
        displayMainMenu();
    }

}

function displayInformationCustomer(i) {
    if (checkEditCustomer) {
        let chooseInfoEdit = prompt(
            "1.Name : " + customerArray[i].getNameCustomer() +
            "\n 2.Id Card : " + customerArray[i].getIdCard() +
            "\n 3.BirthDay : " + customerArray[i].getBirthDay() +
            "\n 4.Email : " + customerArray[i].getEmail() +
            "\n 5.Address : " + customerArray[i].getAddress() +
            "\n 6.Type Customer : " + customerArray[i].getTypeCustomer() +
            "\n 7.Discount : " + customerArray[i].getDiscount() +
            "\n 8.Accompanying : " + customerArray[i].getAccompanying() +
            "\n 9.Type Room : " + customerArray[i].getRoomType() +
            "\n 10.Rent days : " + customerArray[i].getDayOfRent() +
            "\n 11.Type Service : " + customerArray[i].getServiceType() +
            "\n 12.Back"
        );
        if (chooseInfoEdit.toString() !== "12") {
            editInformationCustomer(i, Number.parseInt(chooseInfoEdit) - 1);
        } else {
            checkEditCustomer = false;
            displayCustomer();
        }
    } else {
        alert("Information of customer :" +
            "1.Name : " + customerArray[i].getNameCustomer() +
            "\n 2.Id Card : " + customerArray[i].getIdCard() +
            "\n 3.BirthDay : " + customerArray[i].getBirthDay() +
            "\n 4.Email : " + customerArray[i].getEmail() +
            "\n 5.Address : " + customerArray[i].getAddress() +
            "\n 6.Type Customer : " + customerArray[i].getTypeCustomer() +
            "\n 7.Discount : " + customerArray[i].getDiscount() +
            "\n 8.Accompanying : " + customerArray[i].getAccompanying() +
            "\n 9.Type Room : " + customerArray[i].getRoomType() +
            "\n 10.Rent days : " + customerArray[i].getDayOfRent() +
            "\n 11.Type Service : " + customerArray[i].getServiceType()
        );
    }
    displayMainMenu();
}
function editInformationCustomer(ii, index) {
    let editInfo = prompt("Enter info");
    switch (index) {
        case 0:
            customerArray[ii].setNameCustomer(editInfo);
            break;
        case 1:
            customerArray[ii].setIdCard(editInfo);
            break;
        case 2:
            customerArray[ii].setBirthDay(editInfo);
            break;
        case 3:
            customerArray[ii].setEmail(editInfo);
            break;
        case 4:
            customerArray[ii].setAddress(editInfo);
            break;
        case 5:
            customerArray[ii].setTypeCustomer(editInfo);
            break;
        case 6:
            customerArray[ii].setDiscount(editInfo);
            break;
        case 7:
            customerArray[ii].setAccompanying(editInfo);
            break;
        case 8:
            customerArray[ii].setRoomType(editInfo);
            break;
        case 9:
            customerArray[ii].setDayOfRent(editInfo);
            break;
        case 10:
            customerArray[ii].setServiceType(editInfo);
            break;
        default:
            alert("fail");
            return;
    }
    checkEditCustomer = true;
    displayInformationCustomer(ii);

}

function chooseDeleteCustomer() {
    checkDeleteCustomer = true;
    displayCustomer();
}

function deleteCustomer(i) {
    let chooseConfirm = prompt("Delete Customer :" +
        customerArray[i].getNameCustomer() + "id card " + customerArray[i].getIdCard() +
        "\n 1.yes \n 2.no");
    if (chooseConfirm === "1") {
        customerArray.splice(i, 1);
        alert("complete");
    }
    checkDeleteCustomer = false;
}

function chooseEditInformationCustomer() {
    checkEditCustomer = true;
    displayCustomer();
}

function displayTotalPayCustomer() {
    checkDisplayTotalPay = true;
    displayCustomer();
}

function displayTotalPay(i) {
    alert(customerArray[i].totalPay());
    checkDisplayTotalPay = false;
    displayMainMenu();
}

displayMainMenu();
