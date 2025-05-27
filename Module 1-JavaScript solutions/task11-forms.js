const form = document.getElementById('registrationForm');

form.addEventListener('submit', (e) => {
  e.preventDefault();

  const name = form.elements['name'].value;
  const email = form.elements['email'].value;
  const event = form.elements['event'].value;

  if (!name || !email) {
    alert('Please fill in all fields.');
    return;
  }

  alert(`Thanks ${name} for registering to ${event}`);
});