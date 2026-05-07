const outputBox = document.getElementById("output");

let operands = [];
let currentOperand = "";
let operator = "+";

const processNumClick = (num) => {
    currentOperand += num;
    outputBox.textContent = currentOperand;
};

// number buttons
document.getElementById("btn0").addEventListener("click", () => {
    processNumClick(0);
});

document.getElementById("btn1").addEventListener("click", () => {
    processNumClick(1);
});

document.getElementById("btn2").addEventListener("click", () => {
    processNumClick(2);
});

document.getElementById("btn3").addEventListener("click", () => {
    processNumClick(3);
});

document.getElementById("btn4").addEventListener("click", () => {
    processNumClick(4);
});

document.getElementById("btn5").addEventListener("click", () => {
    processNumClick(5);
});

document.getElementById("btn6").addEventListener("click", () => {
    processNumClick(6);
});

document.getElementById("btn7").addEventListener("click", () => {
    processNumClick(7);
});

document.getElementById("btn8").addEventListener("click", () => {
    processNumClick(8);
});

document.getElementById("btn9").addEventListener("click", () => {
    processNumClick(9);
});

// plus button
document.getElementById("btnPlus").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));

        outputBox.textContent += " + ";

        currentOperand = "";
        operator = "+";
    }
});

// minus button
document.getElementById("btnMinus").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));

        outputBox.textContent += " - ";

        currentOperand = "";
        operator = "-";
    }
});

// equal button
document.getElementById("btnEqual").addEventListener("click", () => {

    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        currentOperand = "";
    }

    let result = operands[0];

    for (let i = 1; i < operands.length; i++) {

        if (operator === "+") {
            result += operands[i];
        }

        if (operator === "-") {
            result -= operands[i];
        }
    }

    outputBox.textContent = result;

    operands = [];
});

// clear button (c)
document.getElementById("btnClear").addEventListener("click", () => {
    operands = [];
    currentOperand = "";
    outputBox.textContent = 0;
});