package ec.edu.uce.figuras;

import org.lwjgl.opengl.GL11;

public class Triangulo extends VentanaFigura {
    public static void main(String[] args) {
        new Triangulo().ejecutar(() -> {
            GL11.glBegin(GL11.GL_TRIANGLES);
            GL11.glColor3f(0f, 0f, 1f); // Azul

            GL11.glVertex2f(-0.5f, -0.5f); // Vértice inferior izquierdo
            GL11.glVertex2f(0.5f, -0.5f); // Vértice inferior derecho
            GL11.glVertex2f(0.0f, 0.5f); // Vértice superior

            GL11.glEnd();
        });
    }
}
