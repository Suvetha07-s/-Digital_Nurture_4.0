const form = document.getElementById('registrationForm');

form.addEventListener('submit', (e) => {
  e.preventDefault();

  const data = {
    name: form.elements['name'].value,
    email: form.elements['email'].value,
    event: form.elements['event'].value
  };

  fetch('https://jsonplaceholder.typicode.com/posts', {
    method: 'POST',
    body: JSON.stringify(data),
    headers: {'Content-Type': 'application/json'}
  })
  .then(res => res.json())
  .then(response => {
    alert('Registration successful!');
  })
  .catch(error => {
    alert('Registration failed.');
  });
});