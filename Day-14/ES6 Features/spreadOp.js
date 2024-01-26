function display(message,...colour) {
    console.log("\n" + message);
    for (let i in colour) {
      console.log("\n" + colour[i]);
    }
  }

  let message = "list of colours";

  display(message, "red");
  display(message, "blue", "yellow");
  display(message, "blue", "yellow", "green");