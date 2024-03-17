const form = document.querySelector("form");
const input = document.querySelector("input[type='text']");
const list = document.querySelector(".list");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  const task = input.value.trim();
  if (task) {
    const li = document.createElement("li");
    li.innerHTML = `
      <span>${task}</span>
      <button>Delete</button>
    `;
    list.appendChild(li);
    input.value = "";
  }
});

list.addEventListener("click", (e) => {
  if (e.target.tagName === "BUTTON") {
    e.target.parentElement.remove();
  }
});
