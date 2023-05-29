import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario")
public class FormularioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los valores enviados desde el formulario
        String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");
        String email = request.getParameter("email");
        String password = request.getParameter("new-password");
        String accountType = request.getParameter("account-type");
        String termsAndConditions = request.getParameter("terms-and-conditions");
        String profilePicture = request.getParameter("profile-picture");
        int age = Integer.parseInt(request.getParameter("age"));
        String referrer = request.getParameter("referrer");
        String bio = request.getParameter("bio");
        
        // Realizar las acciones o procesamiento deseado con los datos obtenidos
        
        // Redirigir o mostrar una respuesta al usuario
        response.sendRedirect("resultado.html");
    }
}