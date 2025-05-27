document.querySelector('#registerBtn').onclick = function() {
  alert('Registered!');
};

document.querySelector('#categoryFilter').onchange = function(e) {
  console.log('Filter by category:', e.target.value);
};

document.querySelector('#searchInput').onkeydown = function(e) {
  if(e.key === 'Enter') {
    console.log('Search:', e.target.value);
  }
};