class Task {
    constructor(title) {
        if (this.constructor === Task) {
            throw new Error("Abstract Class 'Task' cannot be instantiated directly")
        }
        this.title = title
        this.isCompleted = false
    }

    render() {
        throw new Error("Method 'render()' must be implemented by subclasses")
    }


    toggleStatus() {
        this.isCompleted = !this.isCompleted
    }
}


class PersonalTask extends Task {
    constructor(title, priority = "Normal") {
        super(title);
        this.priority = priority
    }

    render() {
        const taskList = document.getElementById("task-list");
        const item = document.createElement("li");
        item.innerHTML = `
            <strong>${this.title}</strong> <br>
            <i>Done: ${this.isCompleted ? "Yes" : "No"} </i>
        `;
        taskList.appendChild(item)
    }
}

// const addTask = ()=>{

// };

function addTask() {
    const textField = document.getElementById("txt-title");
    let title = textField.value

    if (title.trim() === "")
        return;

    const newTask = new PersonalTask(title);
    newTask.render()
    textField.value = "";
}


document.getElementById("btn-add").addEventListener("click", addTask);
document.getElementById("txt-title").addEventListener("keydown", (event) => {
    if (event.key == "Enter")
        addTask()
});