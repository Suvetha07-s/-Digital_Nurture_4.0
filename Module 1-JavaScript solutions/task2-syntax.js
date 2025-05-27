const eventName = "Community Meetup";
const eventDate = "2025-06-01";
let seatsAvailable = 100;

console.log(`Event: ${eventName}, Date: ${eventDate}, Seats left: ${seatsAvailable}`);

function registerSeat() {
  if(seatsAvailable > 0) {
    seatsAvailable--;
    console.log(`Registered! Seats left: ${seatsAvailable}`);
  } else {
    console.log("No seats available");
  }
}

registerSeat();