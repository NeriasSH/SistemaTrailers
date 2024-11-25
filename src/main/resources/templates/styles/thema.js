document.getElementById('theme-toggle').addEventListener('click', function() {
    const body = document.body;
    const navbar = document.querySelector('.navbar');

    // Toggle dark mode
    body.classList.toggle('dark-mode');
    const isDarkMode = body.classList.contains('dark-mode');

    // Update navbar classes
    navbar.classList.toggle('navbar-dark', isDarkMode);
    navbar.classList.toggle('navbar-light', !isDarkMode);
    navbar.classList.toggle('bg-dark', isDarkMode);
    navbar.classList.toggle('bg-light', !isDarkMode);

    // Update button text
    this.textContent = isDarkMode ? 'Modo Claro' : 'Modo Oscuro';

    // Update body background
    body.classList.toggle('bg-dark', isDarkMode);
    body.classList.toggle('bg-light', !isDarkMode);
});