const events = [];

function addEvent(event) {
  events.push(event);
}

function registerUser(eventName) {
  console.log(`User registered for ${eventName}`);
}

function filterEventsByCategory(category, callback) {
  const filtered = events.filter(e => e.category === category);
  callback(filtered);
}

// Closure to track total registrations by category
function registrationCounter() {
  let count = 0;
  return function() {
    count++;
    console.log(`Total registrations: ${count}`);
  };
}

const countRegistrations = registrationCounter();

addEvent({name: "Jazz Night", category: "Music"});
addEvent({name: "Cooking Class", category: "Workshop"});

filterEventsByCategory("Music", (filtered) => {
  console.log(filtered);
  countRegistrations();
});