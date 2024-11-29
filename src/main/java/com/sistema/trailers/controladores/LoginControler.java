package com.sistema.trailers.controladores;

import com.sistema.trailers.modelo.Administrador;
import com.sistema.trailers.repositorios.AdministradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller

public class LoginControler {

    @Autowired
    private AdministradorRepositorio administradorRepository;

    @GetMapping("/loginadmin") // Página de inicio de sesión
    public String mostrarLoginAdmin() {
        return "login"; // Nombre del archivo HTML
    }

    @PostMapping("/procesar-login") // Procesa el formulario de login
    public String procesarLogin(@RequestParam String username,
                                @RequestParam String password,
                                HttpSession session,
                                Model model) {
        Administrador admin = administradorRepository.findByUsername(username);

        if (admin != null && admin.getPassword().equals(password)) {
            session.setAttribute("usuario", admin);
            return "redirect:/"; // Redirige al panel de administración
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "redirect:/"; // Regresa a la vista de login
        }
    }

    @GetMapping("/logout") // Cierra sesión
    public String logout(HttpSession session) {
        session.removeAttribute("usuario");
        return "redirect:/"; // Redirige a la página principal
    }

  /*  @GetMapping("/verifySession")
    public String verifySession(HttpSession session) {
        // Verificar si la sesión tiene el atributo 'usuario'
        if (session.getAttribute("usuario") != null) {
            System.out.println("Sesión activa: " + session.getAttribute("usuario"));
        } else {
            System.out.println("Sesión no activa.");
        }
        return "redirect:/peliculas"; // Redirige a alguna página
    }*/


}
