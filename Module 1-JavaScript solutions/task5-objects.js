function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};

const event1 = new Event("Jazz Night", "2025-07-10", 10);

console.log(event1.checkAvailability());

console.log(Object.entries(event1));