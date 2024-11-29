document.getElementById("login-form").addEventListener("submit", function(event) {
    const username = document.getElementById("username").value.trim();
    const password = document.getElementById("password").value.trim();

    if (!username || !password) {
        alert("Por favor, completa todos los campos.");
        event.preventDefault(); // Evita el envío del formulario
        return;
    }

    if (password.length < 6) {
        alert("La contraseña debe tener al menos 6 caracteres.");
        event.preventDefault();
    }
});
