class Task {
    constructor(title) {
        if (this.constructor === Task) {
            throw new Error("Abstract Class 'Task' cannot be instantiated directly");
        }
        this.title = title;
        this.isCompleted = false;
    }

    toggleStatus() {
        this.isCompleted = !this.isCompleted;
    }
}

class PersonalTask extends Task {
    constructor(title, priority = "Normal") {
        super(title);
        this.priority = priority;
    }

    render() {
        const taskList = document.getElementById("task-list");
        const item = document.createElement("li");

        item.innerHTML = `
            <strong class="task-title">${this.title}</strong> <br>
            <i class="task-status">Done: ${this.isCompleted ? "Yes" : "No"}</i> <br>
            <button class="btn-toggle">
                ${this.isCompleted ? "Undo" : "Mark as Done"}
            </button>
        `;

        // only added logic (no structure change)
        const btn = item.querySelector(".btn-toggle");

        btn.addEventListener("click", () => {
            this.toggleStatus();

            item.querySelector(".task-title").style.textDecoration =
                this.isCompleted ? "line-through" : "none";

            item.querySelector(".task-status").textContent =
                `Done: ${this.isCompleted ? "Yes" : "No"}`;

            btn.textContent =
                this.isCompleted ? "Undo" : "Mark as Done";
        });

        taskList.appendChild(item);
    }
}

function addTask() {
    const textField = document.getElementById("txt-title");
    let title = textField.value;

    if (title.trim() === "") return;

    const newTask = new PersonalTask(title);
    newTask.render();

    textField.value = "";
}

document.getElementById("btn-add").addEventListener("click", addTask);

document.getElementById("txt-title").addEventListener("keydown", (event) => {
    if (event.key == "Enter") addTask();
});