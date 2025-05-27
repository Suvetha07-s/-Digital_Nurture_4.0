function greet(name = "Guest") {
  console.log(`Hello, ${name}!`);
}

const event = { name: "Jazz Night", date: "2025-07-10", seats: 10 };
const { name, date } = event;

const events = [
  { name: "Jazz Night", category: "Music" },
  { name: "Cooking Class", category: "Workshop" }
];

const clonedEvents = [...events];

console.log(name, date);
greet();
greet("Alice");
console.log(clonedEvents);