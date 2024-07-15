import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Palabras del diccionario
            HashMap<String, String> diccionario = new HashMap<>();
            diccionario.put("libro", "book");
            diccionario.put("hola", "hello");
            diccionario.put("bien", "good");
            diccionario.put("noche", "night");
            diccionario.put("día", "day");
            diccionario.put("pagar", "pay");
            diccionario.put("zapato", "shoe");
            diccionario.put("camisa", "t-shirt");
            diccionario.put("medias", "socks");
            diccionario.put("cerveza", "beer");
            diccionario.put("perro", "dog");
            diccionario.put("correr", "run");
            diccionario.put("mirar", "watch");
            diccionario.put("mano", "hand");
            diccionario.put("sombrero", "hat");
            diccionario.put("vestido", "dress");
            diccionario.put("gafas", "glasses");
            diccionario.put("caminar", "walk");
            diccionario.put("trabajar", "work");
            diccionario.put("ver", "see");

            // Palabras al azar
            List<String> lista = new ArrayList<>(diccionario.keySet());
            Random random = new Random();
            List<String> palabrasSeleccionadas = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                String palabra;
                do {
                    palabra = lista.get(random.nextInt(lista.size()));
                } while (palabrasSeleccionadas.contains(palabra));
                palabrasSeleccionadas.add(palabra);
            }

            // Petición al usuario
            int correctas = 0;
            int incorrectas = 0;
            for (String palabra : palabrasSeleccionadas) {
                System.out.println("Traduce la siguiente palabra: " + palabra);
                String respuesta = scanner.nextLine();
                if (diccionario.get(palabra).equalsIgnoreCase(respuesta)) {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }

            // Mostrar resultados
            System.out.println("Respuestas correctas: " + correctas);
            System.out.println("Respuestas incorrectas: " + incorrectas);

            // Reinicia o sale del programa
            System.out.println("¿Deseas reiniciar o salir? (Presiona 1 para reiniciar o cualquier otra tecla para salir)");
            String opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("1")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Gracias por usar el diccionario. ¡Hasta la próxima!");
    }
}
