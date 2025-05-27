const container = document.querySelector('#events-container');

function renderEvents(events) {
  container.innerHTML = '';
  events.forEach(event => {
    const card = document.createElement('div');
    card.textContent = `${event.name} - ${event.category}`;
    container.appendChild(card);
  });
}

renderEvents([
  { name: "Jazz Night", category: "Music" },
  { name: "Cooking Class", category: "Workshop" }
]);