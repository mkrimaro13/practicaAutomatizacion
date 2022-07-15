

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
    public static void main(String[] args){
            // se asigna la propiedad del driver de chrome, y la ruta del driver
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver(); // se instancia el driver
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/index.php");
            //Se obtiene e imprime el título de la página
            String titulo = driver.getTitle();
            System.out.println(titulo);
            //Consulta si el logo de la página está cargando
            driver.findElement(By.id("header_logo"));
            //Selecciona donde tenga un texto similar al indica y le hace click
            driver.findElement(By.linkText("Sign in")).click();
            //Busca el encabezado de autenticación
            driver.findElement(By.className("page-heading"));
            //Selecciona el espacio de texto para ingresar un correo electrónico e ingresa el correo
            driver.findElement(By.name("email_create")).sendKeys("marco osorio");
    }
}
