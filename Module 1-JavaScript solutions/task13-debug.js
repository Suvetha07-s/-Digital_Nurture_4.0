// Add console logs to trace the registration flow
form.addEventListener('submit', (e) => {
  e.preventDefault();
  console.log('Form submitted');

  const name = form.elements['name'].value;
  const email = form.elements['email'].value;
  const event = form.elements['event'].value;

  console.log({name, email, event});

  fetch('https://jsonplaceholder.typicode.com/posts', {
    method: 'POST',
    body: JSON.stringify({name, email, event}),
    headers: {'Content-Type': 'application/json'}
  })
  .then(res => {
    console.log('Fetch response:', res);
    return res.json();
  })
  .then(data => console.log('Response data:', data))
  .catch(err => console.error('Fetch error:', err));
});