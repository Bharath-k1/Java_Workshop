const movies = [
  {
    title: "Inception",
    genre: "Sci-Fi",
    image: "https://m.media-amazon.com/images/M/MV5BMTM0MjUzNjkwMl5BMl5BanBnXkFtZTcwNjY0OTk1Mw@@._V1_.jpg"
  },
  {
    title: "The Dark Knight",
    genre: "Action",
    image: "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"
  },
  {
    title: "Interstellar",
    genre: "Adventure",
    image: "https://image.tmdb.org/t/p/w500/rAiYTfKGqDCRIIqo664sY9XZIvQ.jpg"
  },
  {
    title: "Coco",
    genre: "Animation",
    image: "https://image.tmdb.org/t/p/w500/eKi8dIrr8voobbaGzDpe8w0PVbC.jpg"
  }
];

const movieList = document.getElementById('movieList');
const searchBar = document.getElementById('searchBar');

// Render all movies
function displayMovies(movieArray) {
  movieList.innerHTML = '';
  movieArray.forEach(movie => {
    const movieCard = document.createElement('div');
    movieCard.classList.add('movie-card');
    movieCard.innerHTML = `
      <img src="${movie.image}" alt="${movie.title}" />
      <div class="movie-title">${movie.title}</div>
      <div class="movie-genre">${movie.genre}</div>
    `;
    movieList.appendChild(movieCard);
  });
}

// Search filter
searchBar.addEventListener('input', (e) => {
  const searchText = e.target.value.toLowerCase();
  const filteredMovies = movies.filter(movie =>
    movie.title.toLowerCase().includes(searchText)
  );
  displayMovies(filteredMovies);
});

// Initial display
displayMovies(movies);
