import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class conversorAscii {
    public static void main(String[] args) throws IOException {
        // Carga la imagen
        BufferedImage originalImage = ImageIO.read(new File("/home/dgmtnz/Downloads/JuegoEspacial/OIG44.jpeg"));
        
        // Obtiene las dimensiones y escala la imagen
        int width = originalImage.getWidth() / 16;
        int height = originalImage.getHeight() / 32;
        BufferedImage scaledImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = scaledImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        // Convierte la imagen escalada a escala de grises
        BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        g = grayImage.createGraphics();
        g.drawImage(scaledImage, 0, 0, null);
        g.dispose();

        // Mapea los tonos de gris a caracteres ASCII
        final char[] chars = {' ',' ',' ',' ', '.', ':', '-', '=', '+', '*', 'o', 'O', '0', 'Q', 'M', 'W', '&', '@'};
        for (int y = 0; y < height; y++) {
            System.out.print("\"");
            for (int x = 0; x < width; x++) {
                int gray = (grayImage.getRGB(x, y) & 0xFF);
                // Calcula el índice del carácter basado en la intensidad del gris
                int index = Math.round((chars.length - 1) * (gray / 255f));
                System.out.print(chars[index]);
                
            }
            System.out.println("\\n\"+");
        }
    }
}
