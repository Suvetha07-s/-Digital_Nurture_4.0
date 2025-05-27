// Using fetch with then/catch
fetch('mock-api/events.json')
  .then(response => response.json())
  .then(data => {
    console.log('Events fetched:', data);
  })
  .catch(error => {
    console.error('Fetch error:', error);
  });

// Using async/await
async function loadEvents() {
  try {
    document.getElementById('spinner').style.display = 'block';
    const response = await fetch('mock-api/events.json');
    const data = await response.json();
    document.getElementById('spinner').style.display = 'none';
    console.log('Events:', data);
  } catch (error) {
    console.error(error);
  }
}

loadEvents();