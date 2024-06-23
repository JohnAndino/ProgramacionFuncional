package ec.edu.uce.figuras;

import org.lwjgl.opengl.GL11;

public class Cuadrado extends VentanaFigura {
    public static void main(String[] args) {
        new Cuadrado().ejecutar(() -> {
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glColor3f(0f, 1f, 0f); // Verde

            GL11.glVertex2f(-0.5f, 0.5f); // Vértice superior izquierdo
            GL11.glVertex2f(0.5f, 0.5f); // Vértice superior derecho
            GL11.glVertex2f(0.5f, -0.5f); // Vértice inferior derecho
            GL11.glVertex2f(-0.5f, -0.5f); // Vértice inferior izquierdo

            GL11.glEnd();
        });
    }
}