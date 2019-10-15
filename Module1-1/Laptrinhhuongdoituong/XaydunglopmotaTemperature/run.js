let number1 = document.getElementById("Celcius");
let number2 = document.getElementById("Kelvin");
let number3 = document.getElementById("Farenhein");
function inputC() {
    if (number1.value < -273){
        alert("Minimum C Temperature is -273 !")
    }
    let ts = new tempereture();
    ts.settempC(number1.value*1);
    document.getElementById("Kelvin").value = ts.cToK();
    document.getElementById("Farenhein").value = ts.cToF();
}
function inputK() {
    let ts = new tempereture();
    ts.settempK(number2.value*1);
    document.getElementById("Celcius").value = ts.kToC();
    document.getElementById("Farenhein").value = ts.kToF();
}
function inputF() {
    let ts = new tempereture();
    ts.settempF(number3.value*1);
    document.getElementById("Celcius").value = ts.fToC();
    document.getElementById("Kelvin").value = ts.fToK();
}
