const events = [
  { name: "Jazz Night", date: "2025-07-10", seats: 10 },
  { name: "Old Event", date: "2020-01-01", seats: 5 },
  { name: "Cooking Class", date: "2025-07-15", seats: 0 }
];

function isUpcoming(event) {
  const today = new Date();
  return new Date(event.date) > today && event.seats > 0;
}

events.forEach(event => {
  if (isUpcoming(event)) {
    console.log(`Upcoming Event: ${event.name}`);
  } else {
    console.log(`Skipping past/full event: ${event.name}`);
  }
});

function register(event) {
  try {
    if(event.seats <= 0) throw new Error("No seats available");
    event.seats--;
    console.log(`Registered for ${event.name}. Seats left: ${event.seats}`);
  } catch (error) {
    console.error(error.message);
  }
}

register(events[0]);
register(events[2]);