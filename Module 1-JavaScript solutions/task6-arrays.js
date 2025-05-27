const events = [
  { name: "Jazz Night", category: "Music" },
  { name: "Cooking Class", category: "Workshop" }
];

// Add event
events.push({ name: "Rock Concert", category: "Music" });

// Filter only music events
const musicEvents = events.filter(e => e.category === "Music");

// Map to display format
const displayCards = musicEvents.map(e => `Event: ${e.name}`);

console.log(displayCards);