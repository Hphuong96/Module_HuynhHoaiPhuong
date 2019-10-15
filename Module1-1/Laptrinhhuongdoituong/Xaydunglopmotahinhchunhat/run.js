let number1 = document.getElementById("number1");
let number2 = document.getElementById("number2");
let chuVi = "";
let dienTich = "";
let result = "";
function calculation() {
    let ts = new rectangle();
    ts.setWidth(number1.value * 1);
    ts.setHeight(number2.value * 1);
    chuVi = ts.area();
    dienTich = ts.perimeter();
    let c = document.getElementById("myCanvas");
    let ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.clearRect(0, 0, 1400, 600);
    ctx.rect(20, 20, ts.getWidth(), ts.getHeight());
    ctx.stroke();
    document.getElementById("result").innerHTML = ("Chu vi:" + chuVi + "\n" + "Dien tich:" + dienTich);
}