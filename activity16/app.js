const outputBox = document.getElementById("output");

let operands = [];
let operators = [];
let currentOperand = "";

const processNumClick = (num) => {
    currentOperand += num;
    outputBox.textContent = currentOperand;
};

for (let i = 0; i <= 9; i++) {
    document.getElementById(`btn${i}`).addEventListener("click", () => {
        processNumClick(i);
    });
}

document.getElementById("btnminus").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        operators.push("-");
        currentOperand = "";
        outputBox.textContent = "-";
    }
});

document.getElementById("btnplus").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        operators.push("+");
        currentOperand = "";
        outputBox.textContent = "+";
    }
});

document.getElementById("btnequal").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        currentOperand = "";
    }

    if (operands.length === 0) return;

    let total = operands[0];

    for (let i = 1; i < operands.length; i++) {
        if (operators[i - 1] === "+") {
            total += operands[i];
        } else if (operators[i - 1] === "-") {
            total -= operands[i];
        }
    }

    outputBox.textContent = total;

    operands = [];
    operators = [];
});